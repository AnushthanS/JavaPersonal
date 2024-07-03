package cWH;
import java.util.Scanner;
import java.util.Random;

class Game {
    private int noOfGuesses;
    private int ComputerG;
    int UsrInp;

    public Game() {
        Random ran = new Random();
        ComputerG = ran.nextInt(10);
    }

    public void setnoOfGuesses() {
        this.noOfGuesses = 0;
    }

    public void getnoOfGuesses() {
        noOfGuesses += 1;
    }

    public int takeUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        UsrInp = sc.nextInt();
        return UsrInp;
    }

    public void isCorrectNumber() {

       do {
           takeUserInput();
           if (UsrInp > ComputerG) System.out.println("Guess is greater than the original");
           else if (UsrInp<ComputerG)System.out.println("Guess is smaller than the original");
           getnoOfGuesses();
       }while(UsrInp!=ComputerG);
        if(UsrInp==ComputerG) System.out.printf("You guessed it!\nIt took you %d turn(s).",noOfGuesses);
    }

    public void gameStart() {
        setnoOfGuesses();
        isCorrectNumber();
    }
}

public class Ex3 {
    public static void main(String[] args) {

        /*Create a class Game ,which allows a user to play "Guess the Number"
        game once. Game should have the following methods :
        1) Constructor to generate the random number
        2) takeUserInput() to take a user input of number
        3) isCorrectNumber() to detect whether the number entered by user is correct
        4) getter and setter for noOfGuesses
        Use properties such as noOfGuesses(int),etc. to get this task done
         */

        Game g1= new Game();
        g1.gameStart();

    }
}



//Alternate method
/*
package com.company;
        import java.util.Random;
        import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if (inputNumber==number){
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number, noOfGuesses);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("Too low...");
        }
        else if(inputNumber>number){
            System.out.println("Too high...");
        }
        return false;
    }

}
public class cwh_50_ex3sol {
    public static void main(String[] args) {
        */
/*
            Create a class Game, which allows a user to play "Guess the Number"
            game once. Game should have the following methods:
            1. Constructor to generate the random number
            2. takeUserInput() to take a user input of number
            3. isCorrectNumber() to detect whether the number entered by the user is true
            4. getter and setter for noOfGuesses
            Use properties such as noOfGuesses(int), etc to get this task done!
         *//*


        Game g = new Game();
        boolean b= false;
        while(!b){
            g.takeUserInput();
            b = g.isCorrectNumber();
        }

    }
}
*/



