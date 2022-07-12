package abstracttest;

public class Main {
    public static void main(String[] args) {
        AbstractExample abstractExample = new SomeClass();
        abstractExample.calculateId(12);
        abstractExample.calculateId(1);
    }
}
