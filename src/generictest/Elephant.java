package generictest;

public class Elephant extends Animal {
    Elephant(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Elephant{" +
                "name='" + name + '\'' +
                '}';
    }
}
