package Entity;

public class BankAccount {
    private int number;
    private String owner;
    private double balance;

    public BankAccount(int number, String owner) {
        this.number = number;
        this.owner = owner;
    }

    public BankAccount(int number, String owner, double balance) {
        this.number = number;
        this.owner = owner;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount + 5.00;
    }

    public String toString() {
        return "Account "
                + number
                + ", Holder: "
                + owner
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }
}
