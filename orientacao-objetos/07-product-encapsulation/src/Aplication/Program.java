package Aplication;

import Entity.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        Product product = new Product(name, price);
        System.out.println("Product data: " + product);

        System.out.print("Which percentage to increase the price? ");
        double percentage = sc.nextDouble();
        product.increasePrice(percentage);
        System.out.println("Updated data: " + product);

        System.out.print("How many products to add in stock? ");
        int add = sc.nextInt();
        product.addProducts(add);
        System.out.println("Updated data: " + product);

        System.out.print("How many products to remove in stock? ");
        int remove = sc.nextInt();
        product.removeProducts(remove);
        System.out.println("Updated data: " + product);

        sc.close();
    }
}
