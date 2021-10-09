package cWH;

import java.util.InputMismatchException;
import java.util.Scanner;


class MaxInputException extends Exception{
    @Override
    public String toString(){
        return "Invalid input: Cannot enter a value greater than 100,000";
    }
}

class MaxMultiplierReachedException extends Exception{
    @Override
    public String toString(){
        return "Invalid multiplication input: Cannot enter a value greater than 7,000";
    }
}

class Calculator{
    double a,b;

    public void takeInput(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 2 numbers to perform requested action on :");
         this.a= sc.nextDouble();
         this.b= sc.nextDouble();
    }
    
    public double additionRes()throws InputMismatchException,MaxInputException {
        takeInput();
        if(a>100000 || b>100000) throw new MaxInputException();
        else return a+b;
    }

    public double subtractionRes() throws InputMismatchException,MaxInputException{
        takeInput();
        if(a>100000 || b>100000) throw new MaxInputException();
        else return a-b;
    }

    public double multiplicationRes() throws InputMismatchException,MaxMultiplierReachedException{
        takeInput();
        if(a>7000 || b>7000) throw new MaxMultiplierReachedException();
        else return a*b;
    }

    public double divisionRes() throws ArithmeticException,MaxInputException,InputMismatchException{
        takeInput();
        if(a>100000 || b>100000) throw new MaxInputException();
        else return a/b;
    }

    public void addition(){
        try{
            System.out.println(additionRes());
        }
        catch (MaxInputException e1){
            System.out.println(e1);

        }
        catch (InputMismatchException e2){
            System.out.println(e2);

        }
    }

    public void subtraction(){
        try{
            System.out.println(subtractionRes());
        }
        catch (MaxInputException e1){
            System.out.println(e1);
        }
        catch (InputMismatchException e2){
            System.out.println(e2);
        }
    }

    public void multiplication(){
        try{
            System.out.println(multiplicationRes());
        }
        catch (MaxMultiplierReachedException e1){
            System.out.println(e1);

        }
        catch (InputMismatchException e2){
            System.out.println(e2);

        }
    }

    public void division(){
        try{
            System.out.println(divisionRes());
        }
        catch (MaxInputException e1){
            System.out.println(e1);

        }
        catch (InputMismatchException e2){
            System.out.println(e2);
            e2.printStackTrace();
        }
        catch  (ArithmeticException e3){
            System.out.println(e3);

        }
    }
}
public class Ex6Proper {
    /*
    Exercise 6: You have to create a custom calculator with following operations:
    1. + -> Addition
    2. - -> Subtraction
    3. * -> Multiplication
    4. / -> Division

    which throws the following custom exceptions:
    1. Invalid input Exception ex: 8 & 9
    2. Cannot divide by 0 Exception
    3. Max Input Exception if any of the inputs is greater than 100000
    4. Max Multiplier Reached Exception -> Don't allow any multiplication input to be greater than 7000
    */
    public static void main(String[] args) {
       
        Calculator my_calc = new Calculator();
        System.out.println("Enter : \n1--> Addition\n2--> Subtraction\n3-->Multiplication\n4-->Division");
        Scanner input = new Scanner(System.in);
        while(input.hasNext())
        {int in= input.nextInt();
        switch (in){
        case 1-> my_calc.addition();
        case 2->my_calc.subtraction();
        case 3->my_calc.multiplication();
        case 4->my_calc.division();
        default -> System.out.println("Enter a valid choice");
        }
    }
}
}
