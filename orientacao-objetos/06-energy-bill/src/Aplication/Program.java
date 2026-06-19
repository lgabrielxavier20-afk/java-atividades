package Aplication;

import Entity.EnergyBill;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        EnergyBill bill = new EnergyBill();

        System.out.print("Customer name: ");
        bill.customerName = sc.nextLine();
        System.out.print("Consumo: ");
        bill.kwh = sc.nextDouble();
        System.out.print("Preco por kWh: ");
        bill.pricePerKwh = sc.nextDouble();

        System.out.println();
        System.out.println(bill);

        sc.close();
    }
}
