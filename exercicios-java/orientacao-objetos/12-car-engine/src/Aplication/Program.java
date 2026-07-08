package Aplication;

import Entity.Car;
import Entity.Engine;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Model: ");
        String model = sc.nextLine();

        System.out.print("Year: ");
        int year = sc.nextInt();

        System.out.print("Horsepower: ");
        int horsepower = sc.nextInt();
        sc.nextLine();

        System.out.print("Fuel type: ");
        String fuelType = sc.nextLine();

        Engine engine = new Engine(horsepower, fuelType);
        Car car = new Car(model, year, engine);

        System.out.println();
        System.out.println("Car data:");
        System.out.println(car);

        System.out.print("How many kilometers to drive? ");
        double distance = sc.nextDouble();
        car.drive(distance);

        System.out.println();
        System.out.println("Updated data:");
        System.out.println(car);

        sc.close();
    }
}
