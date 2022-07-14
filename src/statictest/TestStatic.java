package statictest;

public class TestStatic {
    public static String name = "name of TestStatic";

    {
        // some code here
        System.out.println("non static initializer");
    }

    static {
        // some code here
        System.out.println("static initializer");
    }

    public void testStaticFunction(){
        System.out.println("message from testStaticFunction");
    }

}
