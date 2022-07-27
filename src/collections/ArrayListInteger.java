package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Math.sqrt;

public class ArrayListInteger {
    public static void main(String[] args) {

        List<Object> list = Arrays.asList(1, 2, "a", "d", 21, 0, -1);

        List<Object> filterList = filterList(list);
        System.out.println(filterList);

        List<Object> filterList2 = filterList2(list);
        System.out.println(filterList2);

        System.out.println(sqrt(21));
        System.out.println(isSquare(4));
    }

    public static boolean isSquare(int n) {
        return sqrt(n) % 1 == 0;
    }

    public static List<Object> filterList(final List<Object> list) {
        List<Object> result = new ArrayList<>();
        for (Object o : list) {
            if (o instanceof Integer) {
                Integer integer = (Integer) o;
                if (integer >= 0) result.add(o);
            }
        }
        return result;
    }

    public static List<Object> filterList2(final List<Object> list) {
        return list.stream()
                .filter(e -> e instanceof Integer && (Integer) e >= 0)
                .collect(Collectors.toList());
    }

}
