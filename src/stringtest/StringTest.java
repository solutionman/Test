package stringtest;

public class StringTest {
    public static void main(String[] args){
        String hi = "hello";
        String hi1 = "hello";
        String hiNew = new String("hello"); // this will create new object

        System.out.println(hi == hi1); // hi and hi1 refers to one object in stringPool
        System.out.println(hi1 == hiNew); // hi and hi2 different objects
        System.out.println(hi1.equals(hiNew));

        String hey = "hello";

        // intern
        String another =  hi.intern();
        System.out.println(another);

        System.out.println(concatWithoutFirst("dhe", "fllo"));

    }
    static String concatWithoutFirst(String first, String second){
        return first.substring(1) + second.substring(1);
    }
}
