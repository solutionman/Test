package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("List");
        list.add("Iterator");

        // Get ListIterator
        ListIterator<String> listIterator = list.listIterator();

        // Usage of ListIterator
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
        
    }
}
