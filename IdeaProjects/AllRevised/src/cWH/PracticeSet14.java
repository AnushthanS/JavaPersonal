package cWH;

import java.util.Scanner;

class MaxRetriesException extends Exception{
    @Override
    public String toString(){
        return "Custom input";
    }
}

public class PracticeSet14 {


    public static void main(String[] args) throws MaxRetriesException {
        /*//Problem 1
        //a=8; Syntax error
        //Logical error - wrong way to print first 5 prime numbers
        System.out.println(2);
        for(int i=1;i<6;i++){
            System.out.println(2*i+1);
        }
        try{ //Runtime error
            System.out.println(10/0);
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("This will always be executed");
        }*/

       /* //Problem 2
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1 or 2");
        int inpIn = sc.nextInt();
        switch (inpIn){
            case 1 -> throw new ArithmeticException("HaHa");
            case 2 -> throw new IllegalArgumentException("HeHe");
            default -> System.out.println("Enhanced switch");
        }*/

        //Problem 3
        Scanner sc=new Scanner(System.in);
        int count =0;
        int [] ar = {10,20,30,40};

        while(count < 5){
            try{
                System.out.println(ar[sc.nextInt()]);
            }
            catch (Exception c){
                count ++;
                System.out.println("Enter a valid index");
            }
        }//Problem 4
        if(count >4) try {
            throw new MaxRetriesException();
        } catch (MaxRetriesException e) {
            e.printStackTrace();
        }
    }
}
