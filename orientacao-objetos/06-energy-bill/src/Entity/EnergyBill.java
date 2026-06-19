package Entity;

public class EnergyBill {
    public String customerName;
    public double kwh;
    public double pricePerKwh;

    public double subtotal() {
        return kwh * pricePerKwh;
    }

    public double tax() {
        return subtotal() * 0.18;
    }

    public double total() {
        return subtotal() + tax();
    }

    public String toString() {
        return "Conta de energia:\n"
                + "Cliente: " + customerName + "\n"
                + "Consumo: " + String.format("%.2f", kwh) + " kWh\n"
                + "Subtotal: R$ " + String.format("%.2f", subtotal()) + "\n"
                + "Imposto: R$ " + String.format("%.2f", tax()) + "\n"
                + "Total a pagar: R$ " + String.format("%.2f", total());
    }
}
