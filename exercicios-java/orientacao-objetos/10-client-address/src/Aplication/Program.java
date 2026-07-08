package Aplication;

import Entity.Address;
import Entity.Client;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Street: ");
        String street = sc.nextLine();

        System.out.print("Number: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("City: ");
        String city = sc.nextLine();

        System.out.print("State: ");
        String state = sc.nextLine();

        System.out.print("Zip code: ");
        String zipCode = sc.nextLine();

        Address address = new Address(street, number, city, state, zipCode);
        Client client = new Client(name, age, address);

        System.out.println();
        System.out.println("Client data:");
        System.out.println(client);

        sc.close();
    }
}
