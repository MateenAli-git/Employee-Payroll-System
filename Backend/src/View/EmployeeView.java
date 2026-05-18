package View;

import Model.Employee;

public class EmployeeView {

    public void displayEmployee(Employee employee,
                                double netSalary,
                                double tax) {

        System.out.println("\n----------------------------");
        System.out.println("Employee ID : " + employee.getId());
        System.out.println("Name        : " + employee.getName());
        System.out.println("Department  : " + employee.getDepartment());
        System.out.println("Salary      : " + employee.getBasicSalary());
        System.out.println("Bonus       : " + employee.getBonus());
        System.out.println("Deduction   : " + employee.getDeduction());
        System.out.println("Net Salary  : " + netSalary);
        System.out.println("Tax         : " + tax);
        System.out.println("----------------------------");
    }
}