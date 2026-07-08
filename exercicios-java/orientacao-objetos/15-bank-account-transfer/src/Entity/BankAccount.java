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

    public int getNumber() {
        return number;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public boolean transferTo(BankAccount other, double amount) {
        if (amount <= balance) {
            balance -= amount;
            other.deposit(amount);
            return true;
        }
        return false;
    }

    public String toString() {
        return "Account " + number + ", Holder: " + owner + ", Balance: $ " + String.format("%.2f", balance);
    }
}
