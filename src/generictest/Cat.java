package generictest;

public class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
