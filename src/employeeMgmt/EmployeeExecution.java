package employeeMgmt;

import java.util.List;
import java.util.Scanner;

public class EmployeeExecution {

    public static void main(String[] args) {
        EmployeeIO employeeIO = new EmployeeIO();
        EmployeeService employeeService = new EmployeeService();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of employees you want to add:");
        int numOfEmployees = scanner.nextInt();

        List<Employee> employees = employeeIO.readEmployees(numOfEmployees);
        employeeIO.displayEmployees(employees);

        float sumOfSalaries = employeeService.findSumOfSalaryOfAllEmployee(employees);
        Employee highestSalaryEmployee = employeeService.findEmployeeWithHighestSalary(employees);


        System.out.println("Sum of all salaries: " + sumOfSalaries);
        System.out.println("Employee with highest salary: " + highestSalaryEmployee);
        System.out.println("Employees with doubled salaries:");
        List<Employee> doubledSalariesEmployees = employeeService.doubleEveryEmployeeSalary(employees);
        employeeIO.displayEmployees(doubledSalariesEmployees);
    }
}
