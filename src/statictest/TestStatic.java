package statictest;

public class TestStatic {
    public static String name = "name of TestStatic";
    private static String STATIC_FIELD;
    private String nonstatic;

    // нестатичный блок инициализации
    {
        // some code here
        STATIC_FIELD = "hello again from static field";
        nonstatic = "non static value";
        System.out.println("non static initializer: " + STATIC_FIELD);
    }

    // статичный блок инициализации
    static {
        // some code here
        STATIC_FIELD = "hello from static field";
        // nonstatic = "sdf"; // нельзя инициализировать нестатичные поля в статичном блоке инициализации
        System.out.println("static initializer: " + STATIC_FIELD);
    }

    public void testStaticFunction() {
        System.out.println("message from testStaticFunction");
    }

}
