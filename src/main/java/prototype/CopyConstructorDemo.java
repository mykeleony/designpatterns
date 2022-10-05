package prototype;

public class CopyConstructorDemo {
    public static void main(String[] args) {
        Employee myke = new Employee("Myke", new Address("Blablabla", "Sei la a cidade", "BR"));

        Employee debora = new Employee(myke);
        debora.name = "Débora";

        System.out.println(myke);
        System.out.println(debora);
    }
}

class Address {
    public String streetAddress;
    public String city;
    public String country;

    public Address(String streetAddress, String city, String country) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.country = country;
    }

    public Address(Address other) {
        this(other.streetAddress, other.city, other.country);
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetAddress='" + streetAddress + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}

class Employee {
    public String name;
    public Address address;

    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Employee(Employee other) {
        name = other.name;
        address = new Address(other.address);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
