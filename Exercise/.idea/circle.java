package com.codewithharry.shape;

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
        circle c= new circle();
      c.setValues(10);
      c.getValues();
      c.perimeter();
      c.area();
    }
}
