package statictest;

public class Main {
    public static void main(String[] args) {

        // get value from static field before creating class
        // even before getting name runs static initializer
        System.out.println(TestStatic.name);

        // creating new object from class
        // here runs non static initializer
        TestStatic testStatic = new TestStatic();

        // call method of new object
        testStatic.testStaticFunction();
    }
}
