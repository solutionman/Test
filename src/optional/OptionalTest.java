package optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");

        Optional<String> optional = Optional.ofNullable(list.get(1));

        System.out.println(optional.orElse(""));

    }
}
