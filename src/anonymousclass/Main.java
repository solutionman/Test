package anonymousclass;

public class Main {
    public static void main (String[] args){
        SomeInterface anonymousClass = new SomeInterface() {
            private int id;
            private String name;
            @Override
            public void createSomeCoolClass() {
                this.id = 1;
            }

            {
                this.name = "reallyCoolClass";

            }

        };

        anonymousClass.createSomeCoolClass();
        System.out.println(anonymousClass.getClass());
    }
}
