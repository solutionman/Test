package abstracttest;

public abstract class AbstractExample {
    private int id;
    abstract void calculateId(int id);
    int calculateSomeNumber(int input){
        return input * 3;
    }
}
