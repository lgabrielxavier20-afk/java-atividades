package Entity;

public class Address {
    private String street;
    private int number;
    private String city;
    private String state;
    private String zipCode;

    public Address(String street, int number, String city, String state, String zipCode) {
        this.street = street;
        this.number = number;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public int getNumber() {
        return number;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String toString() {
        return street + ", " + number + " - " + city + "/" + state + " - CEP " + zipCode;
    }
}
