package stream.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestJava8 {
    public static void main(String[] args) {

        List<String> alpha = Arrays.asList("a", "b", "c", "d");

        //Before Java8
        List<String> alphaUpper = new ArrayList<>();
        for (String s : alpha) {
            alphaUpper.add(s.toUpperCase());
        }

        System.out.println(alpha); //[a, b, c, d]
        System.out.println(alphaUpper); //[A, B, C, D]

        // Java 8
        List<String> collect = alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect); //[A, B, C, D]

        // Extra, streams apply to any data type.
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> collect1 = num.stream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println(collect1); //[2, 4, 6, 8, 10


        List<String> list = Arrays.asList("one", "two", "three");
        list.stream().forEach(l -> System.out.println(l));

        // map element to element
        List<String> list1 = list.stream()
                .map(l -> "hello " + l)
                .collect(Collectors.toList());
        list1.stream().forEach(System.out::println);

        // flatMap - maps element to multiple elements
        List<String> list2 = list.stream()
                .flatMap(l -> Stream.of(l + " 1", l + " 2", l + " 3", l + " 4"))
                .collect(Collectors.toList());
        list2.stream().forEach(l -> System.out.println(l));
    }
}
