package cWH;

public class StaticNested {
}

class Outer2{
    private static void outerMethod() {
        System.out.println("Inside outerMethod");
    }

    static class StaticNested{
        public static void main(String[] args) {
            System.out.println("Inside inner class method");
            outerMethod();
        }
    }
}