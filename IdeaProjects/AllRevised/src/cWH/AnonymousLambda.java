package cWH;

@FunctionalInterface
interface TestInterface{
    void test();
}

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

        TestInterface t1 = new TestInterface(){
            @Override public void test(){
                System.out.println("Anonymous example of a functional interface implementation!");
            }
        };
        t1.test();
        TestInterface t2 = ()->{
            System.out.println("Lambda expression example of a functional interface implementation!");
        };
        t2.test();
    }
}


@FunctionalInterface
interface DemoAnonymous{
     void method1();
}

class AnonyDemo implements DemoAnonymous{
    @Override public void method1(){
        System.out.println("This is method 1 as referenced from a class");
    }
}