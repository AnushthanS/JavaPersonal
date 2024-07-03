package cWH;

class Example1{
    private int x;

    Example1(int x) {
        this.x = x;
        System.out.println("Base class constructor is being invoked with x = "+this.x);
    }
}

class Example2 extends Example1{
    private int y;
    Example2(int x,int y){
        super(x);
        this.y=y;
        System.out.println("Derived class constructor also invokes base class constructor,while using super keyword for passing attributes,"+this.y);
    }
}

class Example3 extends Example2{
    private int z;
    Example3(int x,int y,int z){
        super (x,y);
        this.z=z;
        System.out.println("Derived-derived constructor invokes first 2 in order of priority,"+this.z);
    }
}

public class Extensions {
    public static void main(String[] args) {
        Example3 ex = new Example3(3,6,9);
    }
}
