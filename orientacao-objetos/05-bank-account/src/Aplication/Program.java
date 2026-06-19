package Aplication;

import Entity.BankAccount;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();

        System.out.print("Enter account number: ");
        account.number = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        account.owner = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        String answer = sc.next();

        if (answer.equals("y")) {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account.deposit(initialDeposit);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        account.deposit(deposit);

        System.out.println("Updated account data:");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);

        System.out.println("Updated account data:");
        System.out.println(account);

        sc.close();
    }
}
