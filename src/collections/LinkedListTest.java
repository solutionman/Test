package collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    public static void main(String[] args) {
        List<Byte> list = new LinkedList<>();
        byte one = 'a';
        byte two = '2';
        byte three = 'c';
        list.add(one);
        list.add(two);
        list.add(three);
        System.out.println(list);
    }
}
