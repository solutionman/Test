package collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class WeakHashMapTest {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(3, "three");
        map.put(1, "one");
        map.put(4, "four");
        map.put(2, "two");
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
