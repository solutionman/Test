package multithread;

public class MainMultiThread {
    public static void main(String[] args){
        System.out.println("Multithreading in Java");
        MyThread myThread = new MyThread();
        AnotherThread anotherThread = new AnotherThread();
//        myThread.run(); // это запустит выполнение в текущем потоке
        myThread.start(); // это запустит в отдельном потоке
        anotherThread.start(); // это запустит еще один отдельный поток

        // Еще один способ запуска потока, через Runner implements Runnable
        Thread thread = new Thread(new Runner());
        thread.start();

        System.out.println("Main thread message");
    }
}

class MyThread extends Thread{
    @Override
    public void run(){
        for(int i = 0; i < 1000; i++){
            System.out.println("1 MyThread thread message " + i);
        }
    }
}

class AnotherThread extends Thread{
    @Override
    public void run(){
        for(int i = 0; i < 1000; i++){
            System.out.println("2 Another thread message " + i);
            if(i == 800){
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class Runner implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i < 1000; i++){
            System.out.println("3 Runner thread message " + i);
        }
    }
}
