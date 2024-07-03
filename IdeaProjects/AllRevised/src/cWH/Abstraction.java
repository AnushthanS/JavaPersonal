package cWH;

abstract class Parent{
    void say(){
        System.out.println("hello");
    }
    abstract void greet();
    abstract void greet2();
}

class Child1 extends Parent{

    @Override
    void greet(){
        System.out.println("Good day");
    }
    @Override
    void greet2(){
        System.out.println("Good evening");
    }

    void greet3(){
        System.out.println("This will not work under dynamic method dispatch");
    }
}

abstract class Child2 extends Parent{
    @Override
    void greet(){
        System.out.println("Good night");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Parent obj = new Child1();  //Dynamic method dispatch
        obj.say();
        obj.greet();
        obj.greet2();

        Child1 objec= new Child1();
        objec.say();    //subclass can call on any of the methods of parent class
        objec.greet3();
    }
}
