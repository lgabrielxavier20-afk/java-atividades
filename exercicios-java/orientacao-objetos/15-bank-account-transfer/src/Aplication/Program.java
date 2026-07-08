package Aplication;

import Entity.BankAccount;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int number1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String owner1 = sc.nextLine();

        System.out.print("Enter initial balance: ");
        double balance1 = sc.nextDouble();

        System.out.print("Enter second account number: ");
        int number2 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter second account holder: ");
        String owner2 = sc.nextLine();

        System.out.print("Enter second initial balance: ");
        double balance2 = sc.nextDouble();

        System.out.print("Transfer amount: ");
        double transferAmount = sc.nextDouble();

        BankAccount first = new BankAccount(number1, owner1, balance1);
        BankAccount second = new BankAccount(number2, owner2, balance2);

        System.out.println();
        System.out.println("Before transfer:");
        System.out.println(first);
        System.out.println(second);

        if (first.transferTo(second, transferAmount)) {
            System.out.println();
            System.out.println("Transfer completed");
        } else {
            System.out.println();
            System.out.println("Transfer denied");
        }

        System.out.println();
        System.out.println("After transfer:");
        System.out.println(first);
        System.out.println(second);

        sc.close();
    }
}
