package cWH;

 class Employee1{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String s){
        name=s;
    }
}

class CellPhone{
     public void ring(){
         System.out.println("Phone is ringing");
     }
     public void vibr(){
         System.out.println("Phone is vibrating");
     }
}

class Square{
     private int side;

     public void setSide(int a){
         side=a;
     }
     public int area(){
         return side*side;
     }
     public int perimeter(){
         return 4*side;
     }
}

class Rectangle{
    private int side1,side2;

    public void setSide(int a,int b){
        side1=a;side2=b;
    }
    public int area(){
        return side1*side2;
    }
    public int perimeter(){
        return 2*(side1+side2);
    }
}
//package RockstarGames
class TommyVecetti{
     void hit(){
         System.out.println("Hitting");
     }
     void run(){
         System.out.println("Running");
     }
     void fire(){
         System.out.println("Firing");
     }
}
class Circle{
    private int radius;

    public void setRadius(int r){
        radius =r;
    }
    public double area(){
        return Math.PI*radius*radius ;
    }
    public double perimeter(){
        return 4*Math.PI*radius;
    }
}

public class PracticeSet8 {
    public static void main(String[] args) {
        //Problem 1
        Employee1 trial = new Employee1();
        trial.setName("Anushthan");
        System.out.println(trial.getName());
        trial.salary=300;
        System.out.println(trial.getSalary());
        System.out.println();

        //Problem 2
        CellPhone pr2 = new CellPhone();
        pr2.ring();
        pr2.vibr();
        System.out.println();

        //Problem 3
        Square pr3=new Square();
        pr3.setSide(4);
        System.out.println(pr3.area());
        System.out.println(pr3.perimeter());
        System.out.println();

        //Problem 4
        Rectangle pr4 = new Rectangle();
        pr4.setSide(4,5);
        System.out.println(pr4.area());
        System.out.println(pr4.perimeter());
        System.out.println();

        //Problem 5
        TommyVecetti pr5 = new TommyVecetti();
        pr5.fire();
        pr5.run();
        pr5.hit();
        System.out.println();

        //Problem 6
        Circle pr6= new Circle();
        pr6.setRadius(10);
        System.out.println(pr6.area());
        System.out.println(pr6.perimeter());
        System.out.println();
    }
}
