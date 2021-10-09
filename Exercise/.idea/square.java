package com.codewithharry.shape;

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
          square obj= new square();
        obj.setValues(15);
        obj.getValues();
        obj.area();
        obj.perimeter();
    }
}
