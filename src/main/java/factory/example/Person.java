package factory.example;

public class Person {
    public int id;
    public String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class PersonFactory {
    static int amount = -1;    // First id must be zero. It will sum up before each object creation.

    Person createPerson(String name) {
        amount++;
        return new Person(amount, name);
    }
}