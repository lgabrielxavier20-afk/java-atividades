package Aplication;

import Entity.BankAccount;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int number = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter account holder: ");
        String owner = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        String answer = sc.next();

        BankAccount account;
        if (answer.equals("y")) {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new BankAccount(number, owner, initialDeposit);
        } else {
            account = new BankAccount(number, owner);
        }

        System.out.println("Account data:");
        System.out.println(account);

        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);

        System.out.println("Updated account data:");
        System.out.println(account);

        sc.close();
    }
}
