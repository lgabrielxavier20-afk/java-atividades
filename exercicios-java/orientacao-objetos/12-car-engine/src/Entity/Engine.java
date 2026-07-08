package Entity;

public class Engine {
    private int horsepower;
    private String fuelType;

    public Engine(int horsepower, String fuelType) {
        this.horsepower = horsepower;
        this.fuelType = fuelType;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public String getFuelType() {
        return fuelType;
    }

    public boolean isPowerful() {
        return horsepower >= 150;
    }

    public String toString() {
        return horsepower + " hp, Fuel: " + fuelType + ", Powerful: " + (isPowerful() ? "yes" : "no");
    }
}
