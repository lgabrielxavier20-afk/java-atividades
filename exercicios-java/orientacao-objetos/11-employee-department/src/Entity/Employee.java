package Entity;

public class Employee {
    private String name;
    private double grossSalary;
    private Department department;

    public Employee(String name, double grossSalary, Department department) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public double annualSalary() {
        return grossSalary * 12.0;
    }

    public void giveRaise(double percentage) {
        grossSalary += grossSalary * percentage / 100.0;
    }

    public String toString() {
        return name + ", Department: " + department + ", Gross Salary: $ " + String.format("%.2f", grossSalary)
                + ", Annual Salary: $ " + String.format("%.2f", annualSalary());
    }
}
