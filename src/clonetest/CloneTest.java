package clonetest;

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        A a = new A();
        a.name = "hello";
        A b = a.clone();
        System.out.println(b.name);
    }
}
