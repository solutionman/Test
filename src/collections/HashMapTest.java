package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class HashMapTest {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(HashMapTest.class.getName());
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(4, "four");
        map.put(3, "three");
        map.put(2, "two");

        // sorting map with streams
        map.entrySet().stream()
//                .sorted(Map.Entry.comparingByKey())
                .sorted(Map.Entry.comparingByValue())
                .forEach(entry -> logger.info(entry.getValue()));
    }
}
