package com.codewithharry.shape;
import java.util.Scanner;
public class square{

      protected int side;
      public void setValues(int side){
            this.side=side;
      }
      public void getValues(){
        System.out.printf("Side : %d\n",this.side);
      }

    public int area(){
      return this.side*this.side;
    }
    public int perimeter(){
          return 4*side;
    }
    public static void main(String[] args) {
      square obj=new square();
      Scanner sc=new Scanner(System.in);
        obj.setValues(sc.nextInt());
        obj.getValues();
        System.out.println("Area : "+obj.area());
        System.out.println("Perimeter : "+obj.perimeter());
    }
}
