package Entity;

public class BankAccount {
    public int number;
    public String owner;
    public double balance;

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
