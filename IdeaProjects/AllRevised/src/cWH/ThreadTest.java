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
        try{
        Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
public class ThreadTest {
    public static void main(String[] args) {
        MyThread1 obj1 = new MyThread1();
        MyThread2 obj2 = new MyThread2();

        obj1.start(); //This will not do anything since our thread has no run methods
        obj2.run();
        obj1.show();

        MyThreadTest mt = new MyThreadTest();
        ExecutorService es = Executors.newCachedThreadPool();

        MyThreadTest mt2 = new MyThreadTest();
        mt2.t.start();

        es.execute(mt);
        es.shutdown();
    }
}
