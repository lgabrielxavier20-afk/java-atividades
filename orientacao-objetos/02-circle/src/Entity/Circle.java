package Entity;

public class Circle {
    public double radius;

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public double diameter() {
        return 2 * radius;
    }
}
