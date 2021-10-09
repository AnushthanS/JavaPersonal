package com.codewithharry.shape;

import com.codewithharry.shape.circle;

import java.util.Scanner;
public class cylinder extends circle{
      int height ;
      public void setValues(int radius,int height){
        super.setValues(radius);
        this.height=height;
      }
      public void getValues(){
        super.getValues();
        System.out.format("Height : %d%n",this.height);
      }

      public double curvedSurfaceArea(){
        return super.perimeter()*this.height;
      }

      public double volume(){
        return super.area()*this.height;
      }

      public static void main(String[] args) {
        cylinder ob=new cylinder();
        Scanner sc= new Scanner(System.in);
        ob.setValues(sc.nextInt(),sc.nextInt());
        ob.getValues();
        System.out.println("Curved Surface Area : "+ob.curvedSurfaceArea());
        System.out.println("Volume : "+ob.volume());
      }
}
