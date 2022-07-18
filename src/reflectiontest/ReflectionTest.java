package reflectiontest;

import java.lang.reflect.Field;

public class ReflectionTest {
    public static void main(String[] args) {
        A a = new A();
        a.setId(1);
        a.setName("hello");

        try {
            Field field = a.getClass().getDeclaredField("name");
            field.setAccessible(true);
            field.set(a, "another name");
        } catch (NoSuchFieldException e ) {
            System.out.println(e.getMessage());
        } catch (IllegalAccessException ex){
            System.out.println(ex.getMessage());
        }

        System.out.println(a.getName());
    }
}
