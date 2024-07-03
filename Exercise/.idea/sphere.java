package com.codewithharry.shape;

public class sphere{
  circle obj = new circle();
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
    sphere sp = new sphere();
    sp.setValues(15);
    sp.getValues();
    System.out.println("Area : "+sp.area());
    System.out.println("Volume : "+sp.volume());
  }
}
