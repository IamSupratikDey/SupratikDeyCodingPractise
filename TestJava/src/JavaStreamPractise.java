import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JavaStreamPractise {

    private  String empName;
    private  int empID;
    private  int employeeSalary;

    public JavaStreamPractise(String empName, int empID, int employeeSalary)
    {
        this.empName = empName;
        this.empID = empID;
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeName ()
    {
        return empName;
    }

    public int getEmployeeID()
    {
        return empID;
    }

    public int empployeeSalary()
    {
        return employeeSalary;
    }

    public static void main (String [] args)
    {
         JavaStreamPractise [] employeeDetails = {
           new JavaStreamPractise("John Doe",111,2000),
           new JavaStreamPractise("Mia Khalifa",112,4000),
           new JavaStreamPractise("Ahana Ray",113,5000)

        };

        List<JavaStreamPractise> employeeGroup = Arrays.stream(employeeDetails).collect(Collectors.toList());

        Map<Character, List<String>> groupEmployee = employeeGroup.stream()
                .collect(Collectors.groupingBy(
                        e -> e.getEmployeeName().charAt(0),           // classifier: group by first char
                        Collectors.mapping(                            // downstream collector
                                JavaStreamPractise::getEmployeeName,      // extract just the name
                                Collectors.toList()                        // collect names into a List
                        )
                ));

        System.out.println("Grouped (Names): " + groupEmployee);

    }
}
