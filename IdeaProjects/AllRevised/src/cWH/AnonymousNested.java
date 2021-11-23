package cWH;

public class AnonymousNested {
    static Demo d=new Demo(){
        @Override void show(){
            super.show();
            System.out.println("Anonymous class method");
        }
    };

    static Demo2 d2=()->{
        System.out.println("Lambda Expression also technically inner class implementation");
    };

    public static void main(String[] args) {
        d.show(); d2.show();
    }
}

class Demo{
    void show(){
        System.out.println("Super class method");
    }
}

@FunctionalInterface
interface Demo2{
     void show();
}