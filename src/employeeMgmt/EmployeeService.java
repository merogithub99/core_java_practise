package employeeMgmt;

import java.util.List;

public class EmployeeService {

    public float findSumOfSalaryOfAllEmployee(List<Employee> employeeList) {
        float sum = 0;
        for (Employee employee : employeeList) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public Employee findEmployeeWithHighestSalary(List<Employee> employeeList) {
        Employee highestSalaryEmployee = null;
        for (Employee employee : employeeList) {
            if (highestSalaryEmployee == null || employee.getSalary() > highestSalaryEmployee.getSalary()) {
                highestSalaryEmployee = employee;
            }
        }
        return highestSalaryEmployee;
    }

    public List<Employee> doubleEveryEmployeeSalary(List<Employee> employeeList) {
        for (Employee employee : employeeList) {
            employee.setSalary(employee.getSalary() * 2);
        }
        return employeeList;
    }
}
