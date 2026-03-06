import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamPractiseQuestionForInterview {

    private  String employee_name;
    private  String department;
    private  String email;
    private  String designation;

    public  StreamPractiseQuestionForInterview(String employee_name, String department, String email, String designation )
    {
        this.employee_name = employee_name;
        this. department = department;
        this.email= email;
        this.designation = designation;
    }

    public  String getEmployee_name()
    {
        return employee_name;
    }
    public void setEmployee_name(String employee_name)
    {
        this.employee_name=employee_name;
    }
    public  String getDepartment()
    {
        return department;
    }
    public void setDepartment(String department)
    {
        this.department=department;
    }
    public  String getemail()
    {
        return email;
    }
    public void setemail(String email)
    {
        this.email=email;
    }
    public  String getdesignation()
    {
        return designation;
    }
    public void setdesignation(String designation)
    {
        this.designation=designation;
    }


    public static void main(String [] args)
    {
          StreamPractiseQuestionForInterview[] employeeDetaails = {
                new StreamPractiseQuestionForInterview("John Doe","IT","john.dow@gamil.com","Consusltant"),
                  new StreamPractiseQuestionForInterview("Mike Doe","Sales","Mike.dow@gamil.com","Senior Consusltant"),
                  new StreamPractiseQuestionForInterview("Charolin Cena","Software Developer","Charolin.Hena@gamil.com","Senior Consusltant"),
                  new StreamPractiseQuestionForInterview("Charles Cambridge","Software Developer","Charles.Cambridge@gamil.com","Tech")
        };

          // Build a java stream to print the name which is starting from C
        List<StreamPractiseQuestionForInterview> employeeNamesStartingFromC = Arrays.stream(employeeDetaails)
                        .filter(emp->emp.getEmployee_name().toUpperCase().startsWith("C"))
                                .collect(Collectors.toList());

        System.out.println("=== DEBUG: Raw employee names ===");
        Arrays.stream(employeeDetaails)
                .forEach(emp -> System.out.println(emp.getEmployee_name()));
        employeeNamesStartingFromC.forEach(name -> System.out.println("Name "+name));

        Map<String, List<StreamPractiseQuestionForInterview>> groupedByDepartment = Arrays.stream(employeeDetaails).
               collect(Collectors.groupingBy(StreamPractiseQuestionForInterview::getDepartment));

        System.out.println("=== Employees by Department ===");
        groupedByDepartment.forEach((dept,employees) ->

                employees.forEach(emp->
                        System.out.println(emp.getEmployee_name()+"->"+dept)
                ));

    }

}
