package com.codewithharry.shape;

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
          cylinder obj = new cylinder();
        System.out.println("Curved Surface Area : "+obj.curvedSurfaceArea());
        System.out.println("Volume : "+obj.volume());
      }
}
