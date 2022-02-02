package collections;

import java.util.List;
import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        List<String> vector = new Vector<>();
        vector.add("hello");
        vector.add("vector");
        int size = vector.size();
        String zeroElement = vector.get(0);
        String firstElement = vector.get(0);

        System.out.println(size);
        System.out.println(zeroElement);
        System.out.println(firstElement);
    }
}
