package cWH;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThread1 extends Thread{
    public void show(){
        System.out.println("Thread1");
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        System.out.println("Thread2 is running");
    }
}

class MyThreadTest implements Runnable{
    Thread t;
    MyThreadTest(){
        t = new Thread(this, "testThread");
    }
    @Override
    public void run() {
        System.out.println("Some code here");
    }
}
public class threadtest {
    public static void main(String[] args) {
        MyThread1 obj1 = new MyThread1();
        MyThread2 obj2 = new MyThread2();

        obj1.start(); //This will not do anything since our thread has no run methods
        obj2.run();
        obj1.show();

        MyThreadTest mt = new MyThreadTest();
        ExecutorService es = Executors.newCachedThreadPool();

        es.execute(mt);
        es.shutdown();
    }
}
