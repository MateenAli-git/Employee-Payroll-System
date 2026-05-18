package utility;

import model.Employee;

import java.io.*;
import java.util.ArrayList;

public class FileHandler {

    private final String FILE_NAME = "employees.txt";

    public void saveEmployees(ArrayList<Employee> employeeList) {

        try {

            BufferedWriter writer =
                    new BufferedWriter(
                            new FileWriter(FILE_NAME)
                    );

            for (Employee employee : employeeList) {

                writer.write(
                        employee.getId() + "," +
                        employee.getName() + "," +
                        employee.getDepartment() + "," +
                        employee.getBasicSalary() + "," +
                        employee.getBonus() + "," +
                        employee.getDeduction()
                );

                writer.newLine();
            }

            writer.close();

            System.out.println("Employees Saved");

        } catch (IOException e) {

            System.out.println("File Error");
        }
    }

    public ArrayList<Employee> loadEmployees() {

        ArrayList<Employee> employeeList =
                new ArrayList<>();

        try {

            BufferedReader reader =
                    new BufferedReader(
                            new FileReader(FILE_NAME)
                    );

            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                Employee employee = new Employee(
                        Integer.parseInt(data[0]),
                        data[1],
                        data[2],
                        Double.parseDouble(data[3]),
                        Double.parseDouble(data[4]),
                        Double.parseDouble(data[5])
                );

                employeeList.add(employee);
            }

            reader.close();

        } catch (IOException e) {

            System.out.println("File Error");
        }

        return employeeList;
    }
}