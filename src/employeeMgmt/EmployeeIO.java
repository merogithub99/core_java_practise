package employeeMgmt;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class EmployeeIO {
    private final Scanner scanner = new Scanner(System.in);
      List<Employee> employeeList = new ArrayList<>();

    public List<Employee> readEmployees(int size) {
        for (int i = 0; i < size; i++) {
            System.out.println("Enter employee id:");
            short id = scanner.nextShort();
            scanner.nextLine(); // Consume newline

            System.out.println("Enter employee name:");
            String fullName = scanner.nextLine();

            System.out.println("Enter employee salary:");
            float salary = scanner.nextFloat();

            System.out.println("Is the employee active (true/false):");
            boolean isActive = scanner.nextBoolean();

            Employee employee = new Employee(id, fullName, salary, isActive);
            employeeList.add(employee);
        }
        return employeeList;
    }

    public void displayEmployees(List<Employee> employees) {
        System.out.println("List of employees:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

//    public List<Employee> getEmployeeList() {
//        return employeeList;
//    }
}
