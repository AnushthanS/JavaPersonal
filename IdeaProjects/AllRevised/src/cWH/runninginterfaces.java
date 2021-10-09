package cWH;

class MyThread3 implements Runnable {
    public void run() {
        int i = 1;
        while (i < 4000) {
            System.out.println("This is thread1, implementing a runnable interface!");
            i++;
        }
    }
}

    class MyThread4 implements Runnable {
        public void run() {
            int i = 1;
            while (i < 4000){
                System.out.println("This is thread2, implementing a runnable interface!");
            i++;
        }
    }
}

    public class runninginterfaces {
        public static void main(String[] args) {
            MyThread3 obj1 = new MyThread3();
            MyThread4 obj2 = new MyThread4();
//        obj1.run();           This is valid but people prefer the method listed below
//        obj2.run();

            Thread t1 = new Thread(obj1);
            Thread t2 = new Thread(obj2);
            t1.start();
            t2.start(); //If we want to use start methods as a thread
        }
    }

