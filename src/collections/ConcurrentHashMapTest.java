package collections;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest {
    public static void main(String[] args){
        Map<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("one","one");
        concurrentHashMap.put("two", "two");
        concurrentHashMap.put("three", "three");

        System.out.println(concurrentHashMap.size());

    }
}
