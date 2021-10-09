package com.codewithharry.shape;
import java.util.Scanner;
public class rectangle{

      protected int length,breadth;
      public void setValues(int length,int breadth){
            this.length=length;
            this.breadth=breadth;
      }
      public void getValues(){
        System.out.printf("Length : %d\nBreadth : %d\n",this.length,this.breadth);
      }

    public void area(){
      System.out.printf("Area : %d\n",this.length*this.breadth);
    }
    public void perimeter(){
      System.out.printf("Perimeter : %d\n",2*(this.length+this.breadth));
    }
    public static void main(String[] args) {
      rectangle obj = new rectangle();
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter length and breadth");
      int a=sc.nextInt();
      int b=sc.nextInt();
        obj.setValues(a,b);
        obj.getValues();
        obj.area();
        obj.perimeter();
    }
}
