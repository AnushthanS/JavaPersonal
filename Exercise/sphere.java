package com.codewithharry.shape;

//import com.codewithharry.shape.circle;
import java.util.Scanner;

public class sphere{
  com.codewithharry.shape.circle obj = new com.codewithharry.shape.circle();
  public void setValues(int radius){
    obj.setValues(radius);
  }

  public void getValues(){
    obj.getValues();
  }

  public double area(){
    return 4*obj.area();
  }

  public double volume(){
    return 4*obj.area()*obj.radius/3.0;
  }

  public static void main(String[] args) {
    sphere ob=new sphere();
    Scanner sc= new Scanner(System.in);
    ob.setValues(sc.nextInt());
    ob.getValues();
    System.out.println("Surface Area : "+ob.area());
    System.out.println("Volume : "+ob.volume());
  }
}
