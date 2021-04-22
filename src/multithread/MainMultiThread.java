package multithread;

public class MainMultiThread {
    public static void main(String[] args){
        System.out.println("Multithreading in Java");
        MyThread myThread = new MyThread();
        AnotherThread anotherThread = new AnotherThread();
//        myThread.run(); // это запустит выполнение в текущем потоке
        myThread.start(); // это запустит в отдельном потоке
        anotherThread.start(); // это запустит еще один отдельный поток
        System.out.println("Message from main method");
    }
}

class MyThread extends Thread{
    @Override
    public void run(){
        for(int i = 0; i < 1000; i++){
            System.out.println("thread one");
        }
    }
}

class AnotherThread extends Thread{
    @Override
    public void run(){
        for(int i = 0; i < 1000; i++){
            System.out.println("thread two");
        }
    }
}
