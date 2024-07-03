package cWH;

class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        System.out.println("Thread 1 executed!");
    }
}

class MyThr2 implements Runnable{
   /* private String name;
    public MyThr2(String name){
        this.name=name;
    }*/
    public void run(){
        System.out.println("Thread 2 executed!");
    }
}

public class ThreadConstructors {
    public static void main(String[] args) {
        //Thread.MAX_PRIORITY =10
        //Thread.MIN_PRIORITY =1
        //Normal Priority =5
        //set values between 1 and 10
        //priorities will be more clear for infinite loops
        //also depend on OperatingSystems

    MyThr obj1 = new MyThr("Anushthan");
        obj1.setPriority(Thread.MAX_PRIORITY);
        obj1.start();
        System.out.println(obj1.getName());
        System.out.println(obj1.getId());


//        MyThr2 obj2 = new MyThr2("Saxena");
//        Thread tr1 = new Thread(obj2);
//        tr1.start();

        Thread t1 = new Thread(new MyThr2(),"Saxena");
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        System.out.println(t1.getName());
        System.out.println(t1.getId());
    }
}
