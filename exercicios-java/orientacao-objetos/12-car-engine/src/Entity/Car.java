package Entity;

public class Car {
    private String model;
    private int year;
    private double kilometers;
    private Engine engine;

    public Car(String model, int year, Engine engine) {
        this.model = model;
        this.year = year;
        this.engine = engine;
        this.kilometers = 0.0;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getKilometers() {
        return kilometers;
    }

    public Engine getEngine() {
        return engine;
    }

    public void drive(double distance) {
        kilometers += distance;
    }

    public boolean needsService() {
        return kilometers >= 10000.0;
    }

    public String toString() {
        return model + " (" + year + "), Engine: " + engine + ", Km: " + String.format("%.1f", kilometers)
                + ", Service needed: " + (needsService() ? "yes" : "no");
    }
}
