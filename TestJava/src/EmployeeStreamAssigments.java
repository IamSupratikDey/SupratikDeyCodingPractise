import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeStreamAssigments {

    private int emp_id;
    private String emp_name;
    private double emp_salary;

    public EmployeeStreamAssigments (int emp_id, String emp_name, double emp_salary)
    {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_salary = emp_salary;
    }

    public int getEmp_id ()
    {
        return emp_id;
    }
    public String getEmp_name()
    {
        return emp_name;
    }
    public double getEmp_salary()
    {
        return emp_salary;
    }

    public void incrementSalaryByGivenValue(double value)
    {
        this.emp_salary = this.emp_salary + value;
    }

    public static void main (String [] args)
    {
        EmployeeStreamAssigments []  empployeeDetails = {
                new EmployeeStreamAssigments(1,"John Doe", 100000.00),
                new EmployeeStreamAssigments(2,"Clerk Kent", 200000.00),
                new EmployeeStreamAssigments(3,"Supratik Dey", 300000.00)
        };

        List<EmployeeStreamAssigments> eployeeWithHigherSalary = Arrays.stream(empployeeDetails)
                .filter(e->e.getEmp_salary()>200000.00)
                .filter(e->e!=null)
                .collect(Collectors.toList());

        List<String> empDetails = eployeeWithHigherSalary.stream()
                        .map(e->e.getEmp_name()+" "+":"+" "+e.getEmp_salary())
                                .collect(Collectors.toList());


        System.out.println("The employee with higher salary is : "+empDetails);

        List<EmployeeStreamAssigments> incrementSalary = Arrays.stream(empployeeDetails)
                .peek(e->e.incrementSalaryByGivenValue(10.00))
                .collect(Collectors.toList());

        List<String> finalSalaryAfterIncrement = incrementSalary.stream()
                .map(e->e.getEmp_name()+" "+":"+" "+ e.getEmp_salary())
                .collect(Collectors.toList());

        System.out.println("The employees salary after the increment is : "+finalSalaryAfterIncrement);
    }
}
