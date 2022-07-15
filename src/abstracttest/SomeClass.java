package abstracttest;

public class SomeClass extends AbstractExample {
    private int number;

    static {
        // some code here
        System.out.println("static initialization of SomeClass");
    }

    {
        this.number = (int) super.calculateSomeNumber(3L);
        System.out.println("Non static initializer");
    }

    public int getNumber(){
        return this.number;
    }

    @Override
    void calculateId(int idd) {
        // some logic here
        System.out.println(idd * 2);
    }
}
