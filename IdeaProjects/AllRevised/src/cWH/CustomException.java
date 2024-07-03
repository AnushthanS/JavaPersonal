package cWH;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString(){
       // return super.toString(); Optional
        return "This is toString()\nExecuted when sout(e) is executed (default)";
    }
    @Override
    public String getMessage(){
        return super.getMessage()+ "\nThis is a getMessage()\nCan be executed in place of toString() as sout(e.getMessage) or with it to display a custom message";
    }
}

public class CustomException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>2){
            try {
                throw new MyException();
                //throw new ArithmeticException("Any default exception can also be thrown");
            }
            catch (Exception e){
                System.out.println(e.toString()); //same as sout(e);
                System.out.println(e.getMessage());
                e.printStackTrace();//will get the location where exception was thrown
            }
        }
    }
}
