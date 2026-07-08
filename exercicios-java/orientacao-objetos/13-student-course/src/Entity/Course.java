package Entity;

public class Course {
    private String title;
    private int hours;
    private double price;

    public Course(String title, int hours, double price) {
        this.title = title;
        this.hours = hours;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getHours() {
        return hours;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return title + ", " + hours + " hours, $ " + String.format("%.2f", price);
    }
}
