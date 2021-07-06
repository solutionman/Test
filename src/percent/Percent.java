package percent;

import java.util.ArrayList;
import java.util.List;

public class Percent {
    public static void main(String[] args) {
        List<List> first = new ArrayList<>();
        List<String> second = new ArrayList<>();
        second.add("hello");
        second.add("helloAgain");
        first.add(second);
        String hi = (first.get(0)).get(0).toString();
        System.out.println(hi);

        List<String> list = new ArrayList();
        list.add("one");
        list.add("two");
        list.add("three");
        int counter = 1;
        int percent = 68;
        int part = 0;
        for (String value : list) {
            part = counter * 32 / list.size();
            System.out.println(percent + part);
            counter++;
        }
    }
}
