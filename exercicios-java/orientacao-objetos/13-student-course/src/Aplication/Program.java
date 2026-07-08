package Aplication;

import Entity.Course;
import Entity.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Student name: ");
        String name = sc.nextLine();

        System.out.print("Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Course title: ");
        String title = sc.nextLine();

        System.out.print("Course hours: ");
        int hours = sc.nextInt();

        System.out.print("Course price: ");
        double price = sc.nextDouble();

        Course course = new Course(title, hours, price);
        Student student = new Student(name, age, course);

        System.out.println();
        System.out.println("Student data:");
        System.out.println(student);

        sc.close();
    }
}
