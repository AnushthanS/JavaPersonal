package com.codewithharry.shape;

import com.codewithharry.shape.square;
import java.util.Scanner;
public class cube extends square{

    public void setValues(int side){
      super.setValues(side);
    }
    public void getValues(){
      super.getValues();
    }
    public int surfaceArea(){
      return super.area()*4;
    }
    public int volume(){
      return super.area()*super.side;
    }
    public  static void main(String[] args) {
      cube obj = new cube();
      Scanner sc=new Scanner(System.in);
      obj.setValues(sc.nextInt());
      obj.getValues();
      System.out.println("Total Surface Area : "+obj.surfaceArea());
      System.out.println("Volume : "+obj.volume());
    }
}
