package service;

import model.Employee;

public class PayrollService {

    public double calculateNetSalary(Employee employee) {

        return employee.getBasicSalary()
                + employee.getBonus()
                - employee.getDeduction();
    }

    public double calculateTax(Employee employee) {

        return calculateNetSalary(employee) * 0.10;
    }
}