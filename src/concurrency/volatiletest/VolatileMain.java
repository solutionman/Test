package concurrency.volatiletest;

public class VolatileMain {
    private static final int NUMBER_OF_THREADS = 4;

    public static void main(String[] args) throws InterruptedException {
        VolatileData volatileData = new VolatileData();
        Thread[] threads = new Thread[NUMBER_OF_THREADS];

        // creating threads
        for (int i = 0; i < NUMBER_OF_THREADS; ++i) {
            threads[i] = new VolatileThread(volatileData);
        }

        // start threads
        for (int i = 0; i < NUMBER_OF_THREADS; ++i) {
            threads[i].start();
        }

        // wait all threads (to die)
        for (int i = 0; i < NUMBER_OF_THREADS; ++i) {
            threads[i].join();
        }
    }
}
