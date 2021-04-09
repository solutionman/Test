package collections;

import java.util.*;

public class Main {
    public static void main(String[] args){

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

        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(12, "John");
        hm.put(2, "Smith");
        hm.put(7, "Peter");
        System.out.println("\nHashMap object output :\n\n" + hm);
        hm.put(12, "Smith");
        System.out.println("\nAfter inserting duplicate key :\n\n" + hm);

        LinkedHashMap<Integer, String> lhmap = new LinkedHashMap<Integer, String>();
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
        while(iterator.hasNext()) {
            Map.Entry me = (Map.Entry)iterator.next();
            System.out.print("Key is: "+ me.getKey() +
                    "& Value is: "+me.getValue()+"\n");
        }
    }

}