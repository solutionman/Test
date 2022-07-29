package generictest;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        List<Cat> cats = new ArrayList<>();

        Cat cat = new Cat("Masha");
        animals.add(cat);
        cats.add(cat);
        animals.forEach(System.out::println);
        cats.forEach(System.out::println);

        Elephant elephant = new Elephant("Bob");
        animals.add(elephant);
        System.out.println("my pets: ");
        animals.forEach(System.out::println);
    }

    void addCat(List<? super Animal> pets, Cat cat) {
        pets.add(cat);
    }
}
