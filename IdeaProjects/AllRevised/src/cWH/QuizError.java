package cWH;

//Problem : keep executing a program to take user input of a given array index till they enter a valid index.
//Print the value at index.


import java.util.Scanner;

public class QuizError {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] demo = {100,98,40,50};
        boolean flag= true;
        while (flag) {
            System.out.println("Enter the value of index");
            int inp = sc.nextInt();
            try {
                try {
                    System.out.printf("The value at index %d is %d\n", inp, demo[inp]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException u) {
                    System.out.println("Enter a valid index");
                }
            }
            catch (Exception e){
                System.out.println("Some other input error occurred : "+e);
            }
        }
        System.out.println("Thanks for accessing the program!");
    }
}
