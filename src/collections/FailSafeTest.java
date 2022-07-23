package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Example of fail-safe
 */
public class FailSafeTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer integer = (Integer) iterator.next();
            list.add(4);
        }
    }
}
