package concurrency.threadjoin;

class ThreadJoinSample extends Thread {
    public int counting = 0;

    ThreadJoinSample(int counting) {
        this.counting = counting;
        System.out.println("Thread created");
    }

    @Override
    public void run() {
        System.out.println("Thread " + this.getName() + " started");

        while (counting > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread " + this.getName() + " interrupted");
            }
            counting--;
        }
        System.out.println("Thread " + this.getName() + " exiting");
    }

    public static void main(String[] args) throws InterruptedException {
        int sleepTime = 2;
        Thread thread = new ThreadJoinSample(sleepTime);
        thread.start();
        System.out.println("Invoking join()");
        System.out.println("thread.isAlive() " + thread.isAlive());
        thread.join();
        System.out.println("Returned from join()");
        System.out.println("thread.isAlive() " + thread.isAlive());
    }

}
