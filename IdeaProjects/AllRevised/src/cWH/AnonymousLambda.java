package cWH;

public class AnonymousLambda {
    public static void main(String[] args) {
        //Regular method
        AnonyDemo obj = new AnonyDemo();
        obj.method1();

        //Anonymous class method, no need for an extra class
        DemoAnonymous obj1 = new DemoAnonymous() {
            @Override
            public void method1() {System.out.println("This is method 1 taken from an anonymous class");}
        }; obj1.method1();

        //Lambda expression way (only for functional interfaces)
        DemoAnonymous obj2 = (/*can pass an argument here*/)-> {
            System.out.println("This is method 1 being called from a lambda expression");
        }; obj2.method1();

    }
}


@FunctionalInterface
interface DemoAnonymous{
    public void method1();
}

class AnonyDemo implements DemoAnonymous{
    @Override public void method1(){
        System.out.println("This is method 1 as referenced from a class");
    }
}