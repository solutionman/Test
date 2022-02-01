package collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {
    public static void main(String[] args){

        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "first");
        map.put(3, "third");
        map.put(2, "second");
        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println("key " + entry.getKey());
            System.out.println("value " + entry.getValue());
        }

        // sorting map with streams
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> System.out.println(entry.getValue()));

    }
}
