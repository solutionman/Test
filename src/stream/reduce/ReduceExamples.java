package stream.reduce;

import java.util.Arrays;
import java.util.List;

public class ReduceExamples {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6);
        int result = integerList
                .stream()
                .reduce(0, (subtotal, element) -> subtotal + element);
        System.out.println("result: " + result); // 21

        // shorter version:
        result = integerList
                .stream()
                .reduce(0, Integer::sum);
        System.out.println("result: " + result); // 21

    }
}
