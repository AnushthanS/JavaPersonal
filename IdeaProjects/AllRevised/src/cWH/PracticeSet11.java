package cWH;

abstract class Pen{
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen{
    void write(){
        System.out.println("Writing...");
    }
    void refill(){
        System.out.println("Filling the ink");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}

class Monkey{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting...");
    }
}

class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("Eating...");
    }
    public void sleep(){
        System.out.println("Getting some rest");
    }
    public void greet(){
        System.out.println("Hello");
    }
}

abstract class TelePhone{
    abstract void ring(long n);
    abstract void lift();
    abstract void disconnect();
}

class SmartPhone extends TelePhone{
    void ring(long n){
        System.out.println("Calling "+n);
    }
    void lift(){
        System.out.println("Picked up call");
    }
    void disconnect(){
        System.out.println("Terminated");
    }
}
interface TVRemote{
    void changeChannel();
    void changeVolume();
}

interface SmartTVRemote extends TVRemote{
    void openYt();
    void chromeCast();
}

class TV implements TVRemote,SmartTVRemote{
    public void changeChannel(){
        System.out.println("Changing the channel");
    }
   public void changeVolume(){
       System.out.println("Changing the volume");
   }
    public void openYt(){
        System.out.println("Opening YT");
    }
    public void chromeCast(){
        System.out.println("ChromeCast activated");
    }
}

public class PracticeSet11 {
    public static void main(String[] args) {
        TelePhone obj1= new SmartPhone();
        obj1.ring(100100100);
        obj1.disconnect();
        BasicAnimal obj2= new Human();
        obj2.eat();
        obj2.sleep();
        Monkey obj3 = new Human();
        obj3.bite();
        obj3.jump();
        Human obj4 =new Human();
        obj4.greet();
    }
}
