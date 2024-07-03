package cWH;
import java.lang.Math;

class Circle1{
    int radius;

    public int getRadius() {
        return radius;
    }

    Circle1(int radius){
        System.out.println("Circle constructor");
        this.radius=radius;
    }

    double area(){
        return Math.PI*radius*radius;
    }
    double perimeter(){
        return 2*Math.PI*radius;
    }
}

class Cylinder1 extends Circle1{
    int height;
    Cylinder1(int radius, int height){
        super(radius);
        System.out.println("Cylinder constructor");
        this.height=height;
    }

    public int getHeight() {
        return height;
    }

    void curvedArea(){
        System.out.println("Curved Surface Area : "+perimeter()*height);
    }

    public void volume(){
        System.out.println("Volume :"+area()*height);
    }
}

class Rectangle2{
    int length,breadth;
    Rectangle2(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public double area(){
        return length*breadth;
    }
}

class Cuboid extends Rectangle2{
    int height;
    Cuboid(int length,int breadth,int height){
        super(length,breadth);
        this.height = height;
    }


    @Override
    public double area(){
        double area = 2*(length*breadth+breadth*height+length*height);
        return area;
    }

    public void areaPrint(){
        System.out.println("The total area is : "+area());
    }
    public void volume(){
        double volume= area()*height;
        System.out.println("Volume : "+volume);
    }
}

public class PracticeSet10 {
    public static void main(String[] args) {
        Cylinder1 dmd = new Cylinder1(10,20);
        dmd.volume();
        dmd.curvedArea();

        Cuboid dmn = new Cuboid(10,15,20);
        dmn.areaPrint();
        dmn.volume();
    }
}
