package stream.tagir;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class DecartMultiplier {
    public static void main(String[] args){

        List<List<String>> input = asList(asList("a","b","c"), asList("x","y"), asList("1", "2", "3"));

        Supplier<Stream<String>> s = input.stream()
                .<Supplier<Stream<String>>>map(list -> list::stream)
                .reduce((sup1, sup2) -> () -> sup1.get()
                .flatMap(e1 -> sup2.get().map(e2 -> e1+e2)))
                .orElse(() -> Stream.of(""));

        s.get().forEach(System.out::println);
    }
}
