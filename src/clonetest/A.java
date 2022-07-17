package clonetest;

public class A implements Cloneable {
    String name;

    public A clone() throws CloneNotSupportedException {
        return (A) super.clone();
    }
}
