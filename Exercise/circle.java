package com.codewithharry.shape;
import java.util.Scanner;
import java.lang.Math;

public class circle{
    public int radius;
    public  void setValues(int radius){
      this.radius=radius;
    }
    public void getValues(){
      System.out.printf("Radius : %d%n",this.radius);
    }
    public double perimeter(){
      return Math.PI*2*this.radius;
    }
    public double area(){
      return Math.PI*Math.pow(this.radius,2);
    }

    public static void main(String[] args) {
      circle obj = new circle();
      Scanner sc=new Scanner(System.in);
      obj.setValues(sc.nextInt());
      obj.getValues();
        System.out.println("Area : "+obj.perimeter());
        System.out.println("Perimeter : "+obj.area());
    }
}
