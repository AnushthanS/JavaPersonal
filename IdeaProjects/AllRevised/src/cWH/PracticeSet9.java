package cWH;

class Cylinder{
    private double radius,height;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder(){
        this.radius=0;
        this.height=0;
    }

    public double curvedSurfaceArea(){

        return 2*Math.PI*radius*height;
    }
    public double volume(){

        return Math.PI*radius*radius*height;
    }
}

class Rectangle1{
    private int length;
    private int breadth;

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public Rectangle1(){
        this.length=4;
        this.length=5;
    }
    public Rectangle1(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}

class Sphere1{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

public class PracticeSet9 {
    public static void main(String[] args) {
        Cylinder pr123= new Cylinder();
        pr123.setRadius(10);
        pr123.setHeight(20);
        System.out.println("Curved Surface Area : "+pr123.curvedSurfaceArea());
        System.out.println("Volume : "+pr123.volume());

        Rectangle1 rt = new Rectangle1(10,20);
        System.out.println("Length : "+rt.getLength());
        System.out.println("Breadth : "+rt.getBreadth());

        Sphere1 sp=new Sphere1();
        sp.setRadius(10);
        System.out.println("Radius : "+sp.getRadius());
    }
}
