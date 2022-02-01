package collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<String>();
        hs.add("John");
        hs.add("Smith");
        hs.add("Peter");
        System.out.println("Before adding duplicate values \n\n" + hs);
        hs.add("John");
        hs.add("Smith");
        System.out.println("\nAfter adding duplicate values \n\n" + hs);
        hs.add(null);
        hs.add(null);
        System.out.println("\nAfter adding null values \n\n" + hs);

        Map<Integer, String> hm = new HashMap<>();
        hm.put(12, "John");
        hm.put(2, "Smith");
        hm.put(7, "Peter");
        System.out.println("\nHashMap object output :\n\n" + hm);
        hm.put(12, "Smith");
        System.out.println("\nAfter inserting duplicate key :\n\n" + hm);

        Map<Integer, String> lhmap = new LinkedHashMap<>();
        //Adding elements to LinkedHashMap
        lhmap.put(22, "Abey");
        lhmap.put(33, "Dawn");
        lhmap.put(1, "Sherry");
        lhmap.put(2, "Karon");
        lhmap.put(100, "Jim");

        // Generating a Set of entries
        Set set = lhmap.entrySet();

        // Displaying elements of LinkedHashMap
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry me = (Map.Entry) iterator.next();
            System.out.print("Key is: " + me.getKey() +
                    "& Value is: " + me.getValue() +
                    " & HashCode is: " + me.hashCode() + "\n");
        }

        int max = 2147483647;
        System.out.println(max + 250);
        int min = -2147483648;
        System.out.println(min - 250);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);

        Map<Object, Object> map = new HashMap<>();
        map.put(1, "hello");
        map.put(2, 5);
        Object value = map.get(1);
        System.out.println(map.get(1));
        System.out.println(map.get(2));

        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("again");
        list.add("yep");
        List<String> testSt = Collections.singletonList(list.get(1));
        System.out.println(testSt);

        AbstractList<String> abstractList = new ArrayList<>();

        abstractList.add("one");
        abstractList.add("two");
        System.out.println(abstractList.size());
        System.out.println(abstractList.get(1));

        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        arrayList.add("first");
        arrayList.add("second");
        arrayList.add("third");
        arrayList.set(1, "replaced second");

        linkedList.add("first");
        linkedList.add("second");
        linkedList.add("third");
        linkedList.set(1, "replaced second");

    }

}