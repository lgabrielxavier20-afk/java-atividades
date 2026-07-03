package Entity;

public class Books {
    private String title;
    private String author;
    private double price;
    private int quantity;

    public Books(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = 0;
    }

    public Books(String title, String author, double price, int quantity) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addCopies(int quantity) {
        this.quantity += quantity;
    }

    public void removeCopies(int quantity) {
        this.quantity -= quantity;
    }

    public void increasePrice(double percentage) {
        price += price * percentage / 100.0;
    }

    public String toString() {
        return title + ", " + author + ", $ " + String.format("%.2f", price)
                + ", " + quantity + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
