package longtest;

public class LongTest {
    public static void main(String[] args) {

        Long a = 500L;
        Long b = 500L;
        System.out.println( a == b); // false
        System.out.println(a.equals(b)); // true

        Long a1 = 50L;
        Long b1 = 50L;
        System.out.println(a1 == b1);      // true
        System.out.println(a1.equals(b1)); // true

        long c = 500L;
        long d = 500L;
        System.out.println(c == d);  // true
    }
}
