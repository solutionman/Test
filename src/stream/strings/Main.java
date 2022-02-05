package stream.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        List<SecondClass> secondClasses = new ArrayList<>();
        secondClasses.add(new SecondClass(1L, "code1"));
        secondClasses.add(new SecondClass(2L, "code2"));
        secondClasses.add(new SecondClass(3L, "code3"));
        FirstClass firstClass = new FirstClass(1L, secondClasses);

        String codes = getCodes(firstClass);
        System.out.println(codes);
    }

    public static String getCodes(FirstClass firstClass){
        return firstClass.secondClass.stream()
                .map(SecondClass::getSomeCode)
                .collect(Collectors.joining(", "));
    }
}
