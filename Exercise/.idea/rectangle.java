package com.codewithharry.shape;

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
          rectangle obj= new rectangle();
        obj.setValues(13,27);
        obj.getValues();
        obj.area();
        obj.perimeter();
    }
}
