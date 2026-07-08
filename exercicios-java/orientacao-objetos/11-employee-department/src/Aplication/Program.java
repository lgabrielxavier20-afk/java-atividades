package Aplication;

import Entity.Department;
import Entity.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Department name: ");
        String departmentName = sc.nextLine();

        System.out.print("Department code: ");
        String departmentCode = sc.nextLine();

        System.out.print("Employee name: ");
        String employeeName = sc.nextLine();

        System.out.print("Gross salary: ");
        double grossSalary = sc.nextDouble();

        Department department = new Department(departmentName, departmentCode);
        Employee employee = new Employee(employeeName, grossSalary, department);

        System.out.println();
        System.out.println("Employee data:");
        System.out.println(employee);

        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.giveRaise(percentage);

        System.out.println();
        System.out.println("Updated data:");
        System.out.println(employee);

        sc.close();
    }
}
