package stringtest;

public class StringTest {
    public static void main(String[] args){
        String string = "hello";
        String hi = "hello";
        String hey = "hello";

        // intern
        String another =  string.intern();
        System.out.println(another);

    }
}
