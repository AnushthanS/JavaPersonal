package cWH;

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
public class threadtest {
    public static void main(String[] args) {
        MyThread1 obj1 = new MyThread1();
        MyThread2 obj2 = new MyThread2();

        obj1.start(); //This will not do anything since our thread has no run methods
        obj2.run();
        obj1.show();
    }
}
