package generictest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        GenericTest genericTest = new GenericTest();

        List<Animal> animals = new ArrayList<>();
        List< Animal> cats = new ArrayList<>();

        Cat cat = new Cat("Masha");
        animals.add(cat);
        genericTest.addCat(cats, cat);
        System.out.println("My cats:");
        cats.forEach(System.out::println);

        Elephant elephant = new Elephant("Bob");
        animals.add(elephant);
        System.out.println("my pets: ");
        animals.forEach(System.out::println);

    }

}
