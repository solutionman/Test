package finalizetest;

public class FinalizeTest {
    public static void main(String[] args){
        A a = new A();
        a.name = "hi";
//        a = null;
        a = new A();
        try {
            a.finalize();
        } catch (Throwable e){
            System.out.println(e);
        }
        System.gc();
        System.out.println(a.name);
    }
}
