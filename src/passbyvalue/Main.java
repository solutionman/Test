package passbyvalue;

// Параметры в методы передается по значению
public class Main {
    public static void main(String[] args) {
        One one = new One();
        one.setName("one");
        One another = one;
        another.setName("another");

        System.out.println(one.getName());
        System.out.println(another.getName());
        ServiceTest serviceTest = new ServiceTest();

        // Передали объект в метод, поменяли ему имя, и теперь у него другое имя
        serviceTest.renameObject(one);
        System.out.println(one.name);
    }

    static class ServiceTest {
        void renameObject(One one) {
            one.name = "changed One in method renameObject";

        }
    }
}
