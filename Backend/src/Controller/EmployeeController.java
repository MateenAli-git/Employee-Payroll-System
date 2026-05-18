package controller;

import model.Employee;

import java.util.ArrayList;

public class EmployeeController {

    private ArrayList<Employee> employeeList;

    public EmployeeController() {

        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {

        employeeList.add(employee);

        System.out.println("Employee Added");
    }

    public void removeEmployee(int id) {

        for (int i = 0; i < employeeList.size(); i++) {

            if (employeeList.get(i).getId() == id) {

                employeeList.remove(i);

                System.out.println("Employee Removed");

                return;
            }
        }

        System.out.println("Employee Not Found");
    }

    public Employee searchEmployee(int id) {

        for (Employee employee : employeeList) {

            if (employee.getId() == id) {

                return employee;
            }
        }

        return null;
    }

    public void updateEmployee(int id,
                               String name,
                               String department,
                               double salary,
                               double bonus,
                               double deduction) {

        Employee employee = searchEmployee(id);

        if (employee != null) {

            employee.setName(name);
            employee.setDepartment(department);
            employee.setBasicSalary(salary);
            employee.setBonus(bonus);
            employee.setDeduction(deduction);

            System.out.println("Employee Updated");
        }
    }

    public ArrayList<Employee> getAllEmployees() {

        return employeeList;
    }
}