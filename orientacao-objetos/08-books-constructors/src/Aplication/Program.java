package Aplication;

import Entity.Books;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.print("Title: ");
        String title = sc.nextLine();

        System.out.print("Author: ");
        String author = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        System.out.print("Quantity: ");
        int quantity = sc.nextInt();

        Books book = new Books(title, author, price, quantity);
        System.out.println("Book data:");
        System.out.println(book);

        System.out.print("Which percentage to increase the price? ");
        double percentage = sc.nextDouble();
        book.increasePrice(percentage);
        System.out.println("Updated data:");
        System.out.println(book);

        System.out.print("How many units to add? ");
        int add = sc.nextInt();
        book.addCopies(add);
        System.out.println("Updated data:");
        System.out.println(book);

        System.out.print("How many units to remove? ");
        int remove = sc.nextInt();
        book.removeCopies(remove);
        System.out.println("Updated data:");
        System.out.println(book);

        sc.close();
    }
}
