package objecttest;

public class ObjectTest {
    public static void main(String[] args) throws InterruptedException {
        /*
        * Methods in Object.class
        */

        A a = new A();
        A a1 = new A();

        System.out.println(a.equals(new A()));
        System.out.println(a.equals(a1));

        System.out.println(a.hashCode());
        System.out.println(a.hashCode());
        A a2 = new A();
        System.out.println(a2.hashCode());
        System.out.println(new A().hashCode());

        System.out.println(a.getClass());
        System.out.println(a.toString());

    }
}
