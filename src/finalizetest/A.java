package finalizetest;

public class A {
    public String name;

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize called");
        System.out.println("Here we can call some methods, for example close some connections before destroying this object");
        super.finalize();
    }
}
