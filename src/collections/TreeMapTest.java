package collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args){
        Map<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(1, "one");
        treeMap.put(4, "four");
        treeMap.put(3, "three");
        treeMap.put(2, "two");

        for(Map.Entry<Integer, String> map : treeMap.entrySet()){
            System.out.println("key: " + map.getKey());
            System.out.println("value: " + map.getValue());
        }
    }
}
