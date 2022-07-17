package casting;

public class CastingTest {

    public static void main(String[] args) {

        int a = 1;
        long b = a;
        System.out.println(b);

        b = 2L;
        a = (int) b;
        System.out.println(a);

        A classA = new A();
        Object object = classA;
        A classA1 = (A) object;

        // ClassCastException
        B classB = (B) object;

    }
}
