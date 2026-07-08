package Entity;

public class Product {
    private String name;
    private double price;
    private int quantity;
    private Category category;

    public Product(String name, double price, int quantity, Category category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public Category getCategory() {
        return category;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public void increasePrice(double percentage) {
        price += price * percentage / 100.0;
    }

    public void applyDiscount(double percentage) {
        price -= price * percentage / 100.0;
    }

    public String toString() {
        return name + ", Category: " + category + ", $ " + String.format("%.2f", price)
                + ", " + quantity + " units, Total: $ " + String.format("%.2f", totalValueInStock());
    }
}
