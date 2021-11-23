package cWH;

public class MethodLocalInner {
    public static void main(String[] args) {
        Outer1 x=new Outer1();
        x.outerMethod();
    }
}

class Outer1{
    void outerMethod(){
        System.out.println("Inside outer method");


        class Inner{
            void innerMethod(){
                System.out.println("Inside inner method");
            }
        }

        Inner y = new Inner();
        y.innerMethod();
    }
}