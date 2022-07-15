package abstracttest;

public abstract class AbstractExample {
    private long id;
    abstract void calculateId(int id);
    protected long calculateSomeNumber(long input){
        this.id = input;
        return id * 3L;
    }
}
