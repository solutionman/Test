package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorRemove {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("iterator");
        list.add("remove");
        list.add("me");

        Iterator<String> iterator = list.iterator();

        /*
         * Если пытаемся удалить элемент без предварительного hasNext()
         * Получим ошибку IllegalStateException
         * */
        try {
            iterator.remove();
        } catch (Exception e) {
            System.out.println(e);
        }

        /*
         * Если предварительно вызывается hasNext()
         * Элемент коллекции удаляется.
         * */
        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
            if (iterator.next().equals("remove")) {
                iterator.remove();
            }
        }

        System.out.println("!after removing value!");
        for (String s : list) {
            System.out.println(s);
        }


    }
}
