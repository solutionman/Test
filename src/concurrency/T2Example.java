package concurrency;

class T {
    String n;
}

class T2 extends T implements Runnable {
    public void foo() {
        int count = 0;
        while (count < 10) {
            ++count;
            System.out.println(count);
        }
    }

    @Override
    public void run() {
        System.out.println("Current thread name: " + Thread.currentThread().getName() + " id: " + Thread.currentThread().getId());
        foo();
    }
}

public class T2Example {
    public static void main(String[] args) {

        T2 t2 = new T2();

        Thread thread = new Thread(t2);
        thread.start();

        System.out.println("Main thread name: " + Thread.currentThread().getName() + " id: " + Thread.currentThread().getId());
    }
}
