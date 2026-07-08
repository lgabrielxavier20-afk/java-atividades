package Aplication;

import Entity.Category;
import Entity.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Category name: ");
        String categoryName = sc.nextLine();

        System.out.print("Product name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        System.out.print("Quantity: ");
        int quantity = sc.nextInt();

        Category category = new Category(categoryName);
        Product product = new Product(name, price, quantity, category);

        System.out.println();
        System.out.println("Product data:");
        System.out.println(product);

        System.out.print("Which percentage to discount? ");
        double discount = sc.nextDouble();
        product.applyDiscount(discount);

        System.out.println();
        System.out.println("Updated data:");
        System.out.println(product);

        System.out.print("How many units to add? ");
        int add = sc.nextInt();
        product.addProducts(add);

        System.out.println();
        System.out.println("Updated data:");
        System.out.println(product);

        System.out.print("How many units to remove? ");
        int remove = sc.nextInt();
        product.removeProducts(remove);

        System.out.println();
        System.out.println("Updated data:");
        System.out.println(product);

        sc.close();
    }
}
