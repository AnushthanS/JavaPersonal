package cWH;

import java.util.Scanner;
class NegativeDimensionException extends Exception{
    @Override
    public String toString(){
        return "Use a positive value to assign dimension!";
    }
    @Override
    public String getMessage(){
        return "Use a positive value to assign dimension!";
    }
}

public class ThrowThrows {
    //Throws is similar to a comment


    static  double area(double r) throws NegativeDimensionException {
        if(r<0) throw new NegativeDimensionException();
        else return Math.PI*r*r;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            double ret = area(in.nextDouble());
            System.out.println(ret);
        } catch (NegativeDimensionException e) {
            System.out.println( e.toString());
        }
        finally {
            in.close();
        }
    }
}