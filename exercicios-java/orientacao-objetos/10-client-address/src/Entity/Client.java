package Entity;

public class Client {
    private String name;
    private int age;
    private Address address;

    public Client(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public boolean isAdult() {
        return age >= 18;
    }

    public String toString() {
        return name + ", " + age + " years old\n"
                + "Address: " + address + "\n"
                + "Adult: " + (isAdult() ? "yes" : "no");
    }
}
