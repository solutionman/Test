package abstracttest;

public class SomeClass extends AbstractExample {
    private int number;

    static {
        // some code here
        System.out.println("static initialization of SomeClass");
    }

    {
        this.number = super.calculateSomeNumber(3);
        System.out.println("Non static initializer");
    }

    public int getNumber(){
        return this.number;
    }

    @Override
    void calculateId(int id) {
        // some logic here
        System.out.println(id * 2);
    }
}
