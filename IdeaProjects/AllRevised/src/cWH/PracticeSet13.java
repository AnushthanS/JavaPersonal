package cWH;

class PT1 extends Thread{
    @Override
    public void run(){int i=0;
        try {
            while (i<50) {
                System.out.println("Good Morning!");
                Thread.sleep(500);
                i++;
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

class PT2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<50){
            System.out.println("Welcome");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}

public class PracticeSet13 {
    public static void main(String[] args) {
        PT1 t1 =new PT1();
        PT2 t2 = new PT2();
        t1.setPriority(10);
        t2.setPriority(1);
        System.out.println(t1.getState());
        t1.start();
        t2.start();
        System.out.println(t2.getState());
        System.out.println(Thread.currentThread().getState());
    }
}
