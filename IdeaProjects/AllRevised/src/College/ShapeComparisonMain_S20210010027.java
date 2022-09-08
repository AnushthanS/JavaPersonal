package College;

import java.util.ArrayList;
import java.util.Random;

class Point{
    private int coordinateX, coordinateY;

    public Point(int coordinateX, int coordinateY) {
        setPoint(coordinateX, coordinateY);
    }
    public Point(){
        this(0,0);
    }
    public Point(int coordinateX) {
        this(coordinateX, 0);
    }

    public void setPoint(int coordinateX, int coordinateY){
        try{
            setCoordinateX(coordinateX);
            setCoordinateY(coordinateY);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public int getCoordinateX() {
        return coordinateX;
    }


    public void setCoordinateX(int coordinateX) throws Exception {
        if(coordinateX < 0 || coordinateX > 15){
            throw new Exception("Exception: Invalid value of X coordinate");
        } else this.coordinateX = coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) throws Exception{
        if(coordinateY < 0 || coordinateY > 15){
            throw new Exception("Exception: Invalid value of Y coordinate");
        } else this.coordinateY = coordinateY;
    }
    public void print(){
        System.out.println("Coordinates = ("+getCoordinateX()+", "+getCoordinateY()+")");
    }
}

class Rectangle{
    Point pointOne, pointTwo;
    private int height, width;

    public Rectangle(Point pointOne, Point pointTwo) {
        this.pointOne = pointOne;
        this.pointTwo = pointTwo;
        this.height = this.pointTwo.getCoordinateY() - this.pointOne.getCoordinateY();
        this.width = this.pointTwo.getCoordinateX() - this.pointOne.getCoordinateX();
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
    public int getAreaRectangle(){
        return getHeight()*getWidth();
    }
    public boolean isSmaller(Rectangle rect){
        return this.getAreaRectangle() > rect.getAreaRectangle();
    }
    public void print(){
        System.out.print("Point 1:");
        pointOne.print();

        System.out.print("Point 2:");
        pointTwo.print();

        System.out.println("Height : "+getHeight());
        System.out.println("Width  : "+getWidth());
        System.out.println("Area   : "+getAreaRectangle());
    }
    public boolean isSmallerCircle(Circle circle){
        return circle.getAreaCircle() < this.getAreaRectangle();
    }
}

class Circle{
    Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getAreaCircle(){
        return Math.PI * Math.pow(getRadius(), 2);
    }
    public void print(){
        System.out.print("Center :");
        center.print();
        System.out.println("Radius : "+getRadius());
    }
    public boolean isSmaller(Circle circle){
        return circle.getAreaCircle() < this.getAreaCircle();
    }
    public boolean isSmallerRectangle(Rectangle rectangle){
        return rectangle.getAreaRectangle() < this.getAreaCircle();
    }
}
public class ShapeComparisonMain_S20210010027 {
    public static void sortRectangles(ArrayList<Rectangle> rectangleList){
        for(int i = 0; i< rectangleList.size(); i++){
            boolean swapped=false;
            for(int j = 1; j< rectangleList.size() - i; j++){
                if(rectangleList.get(j).getAreaRectangle() < rectangleList.get(j - 1).getAreaRectangle()){
                    Rectangle temp = rectangleList.get(j);
                    rectangleList.set(j, rectangleList.get(j-1));
                    rectangleList.set(j - 1, temp);
                    swapped=true;
                }
            }
            if(!swapped) break;
        }
    }

    public static void sortCircles(ArrayList<Circle> circleList){
        for(int i = 0; i< circleList.size(); i++){
            boolean swapped=false;
            for(int j = 1; j< circleList.size() - i; j++){
                if(circleList.get(j).getAreaCircle() < circleList.get(j - 1).getAreaCircle()){
                    Circle temp = circleList.get(j);
                    circleList.set(j, circleList.get(j-1));
                    circleList.set(j - 1, temp);
                    swapped=true;
                }
            }
            if(!swapped) break;
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        Point p = new Point(10, 20);
        p.print();

        ArrayList<Rectangle> rectangleList = new ArrayList<>();
        ArrayList<Circle> circleList = new ArrayList<>();

        rectangleList.add(new Rectangle(new Point(0, 0), new Point(4, 4)));
        rectangleList.add(new Rectangle(new Point(0, 0), new Point(10, 10)));
        for (int i = 3; i < 5; i++){
            rectangleList.add(new Rectangle(new Point(0, 0), new Point(i+2, i+2)));
        }

        circleList.add(new Circle(new Point(0, 0), 7));
        circleList.add(new Circle(new Point(0, 0), 3));
        for (int i = 2; i < 4; i++){
            circleList.add(new Circle(new Point(0, 0), i + 2));
        }
        System.out.println();
        System.out.println("List of rectangles:");
        for(Rectangle rectangle: rectangleList){
            rectangle.print();
        }
        System.out.println();
        System.out.println("List of circles:");
        for(Circle circle: circleList){
            circle.print();
        }
        System.out.println();
        Rectangle rectangle = rectangleList.get(random.nextInt(rectangleList.size() - 1));
        Circle circle = circleList.get(random.nextInt(circleList.size() - 1));

        System.out.println("Randomly selected Rectangle:");
        rectangle.print();

        System.out.println("Randomly selected circle:");
        circle.print();

        System.out.println();
        Rectangle testRectangle = rectangleList.get(random.nextInt(rectangleList.size() - 1));

        Circle testCircle = circleList.get(random.nextInt(circleList.size() - 1));

        System.out.println("Test for isSmaller for Rectangle Class");
        rectangle.print();
        testRectangle.print();
        System.out.println("isSmaller: "+rectangle.isSmaller(testRectangle));
        System.out.println("Reverse case- isSmaller: "+testRectangle.isSmaller(rectangle));
        System.out.println();

        System.out.println("Test for isSmallerCircle for Rectangle Class");
        rectangle.print();
        circle.print();
        System.out.println("isSmallerCircle: "+rectangle.isSmallerCircle(circle));
        System.out.println();
        System.out.println("Another Case:");
        testRectangle.print();
        testCircle.print();
        System.out.println("isSmallerCircle: "+ testRectangle.isSmallerCircle(testCircle));
        System.out.println();

        System.out.println("Test for isSmaller for Circle Class");
        circle.print();
        testCircle.print();
        System.out.println("isSmaller: "+circle.isSmaller(testCircle));
        System.out.println("Reverse case- isSmaller: "+testCircle.isSmaller(circle));
        System.out.println();

        System.out.println("Test for isSmallerRectangle for Circle Class");
        circle.print();
        rectangle.print();
        System.out.println("isSmallerRectangle: "+circle.isSmallerRectangle(rectangle));
        System.out.println();
        System.out.println("Another Case:");
        testRectangle.print();
        testCircle.print();
        System.out.println("isSmallerRectangle: "+ testCircle.isSmallerRectangle(testRectangle));
        System.out.println();

        System.out.println("Sorted rectangles:");
        sortRectangles(rectangleList);
        for(Rectangle rectangle1: rectangleList){
            rectangle1.print();
        }

        System.out.println("\nSorted circles:");
        sortCircles(circleList);
        for(Circle circle1: circleList){
            circle1.print();
        }
    }
}
