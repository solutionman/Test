package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveElements {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }

        // Удаляем по одному элементу с 2000 по 20000
        long start = System.currentTimeMillis();
        for (int i = 2000; i < 20000; i++) {
            list.remove(i);
        }
        long finish = System.currentTimeMillis() - start;
        System.out.println("время удаления по одному элементу: " + finish + "ms");
        System.out.println(list.size());

        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            list2.add(i);
        }
        // Удаляем элементы при помощи subList
        start = System.currentTimeMillis();
        list2.subList(2000, 20000).clear();
        finish = System.currentTimeMillis() - start;
        System.out.println("Время удаления через subList " + finish);
        System.out.println(list2.size());
    }
}
