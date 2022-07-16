package anonymousclass;

public class Main {
    public static void main(String[] args) {

        // create anonymous class from interface
        SomeInterface anonymousClass = new SomeInterface() {
            private int id;
            private String name;

            @Override
            public void createSomeCoolClass() {
                this.id = 1;
                this.name = "not so cool";
                System.out.println("id " + this.id);
                System.out.println("name " + this.name);
            }

            {
                this.name = "reallyCoolClass";
                System.out.println("id " + this.id);
                System.out.println("name " + this.name);
            }

            public String getName() {
                return name;
            }
        };

        anonymousClass.createSomeCoolClass();
        System.out.println(anonymousClass.getClass());

        // create anonymous class from abstract class
        AbstractClass anonymousClass2 = new AbstractClass() {
            @Override
            public void doSomethingMethod() {
                System.out.println("run from anonymous class hmmm");
                super.doSomethingMethod();
            }

            public void cantCallOutside() {
                System.out.println("never run");
            }
        };
        anonymousClass2.doSomethingMethod();
        // anonymousClass2.cantCallOutside();  // error

    }
}
