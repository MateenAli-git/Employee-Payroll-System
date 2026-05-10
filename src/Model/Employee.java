package Model;

public class Employee {

    private int id;
    private String name;
    private String department;
    private double basicSalary;
    private double bonus;
    private double deduction;

    public Employee(int id,
                    String name,
                    String department,
                    double basicSalary,
                    double bonus,
                    double deduction) {

        this.id = id;
        this.name = name;
        this.department = department;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
        this.deduction = deduction;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public double getDeduction() {
        return deduction;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setDeduction(double deduction) {
        this.deduction = deduction;
    }
}