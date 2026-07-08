package Aplication;

import Entity.Circle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();

        System.out.print("Enter radius: ");
        c.radius = sc.nextDouble();

        System.out.printf("AREA = %.2f%n", c.area());
        System.out.printf("CIRCUMFERENCE = %.2f%n", c.circumference());
        System.out.printf("DIAMETER = %.2f%n", c.diameter());

        sc.close();
    }
}
