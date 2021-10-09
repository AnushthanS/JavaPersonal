package cWH;
import java.util.Scanner;

public class PracticeSet1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     /*   System.out.println("Part 1 = Sum of 3 numbers");
        System.out.println("Enter no1");
        int a = sc.nextInt();
        System.out.println("Enter no2");
        int b = sc.nextInt();
        System.out.println("Enter no3");
        int c = sc.nextInt();
        int sum = a+b+c;
        System.out.println("The sum of these numbers is : "+sum); */

        /*System.out.println("Part 2 = CGPA of 3 subjects (Marks out of 100)");
        System.out.println("Enter marks for sub1");
        double sub1 = sc.nextDouble();
        System.out.println("Enter marks for sub2");
        double sub2 = sc.nextDouble();
        System.out.println("Enter marks for sub 3");
        double sub3 = sc.nextDouble();
        double per = (sub1+sub2+sub3)/3;
        double cgpa = per/9.5;
        if (cgpa>10.0){cgpa = 10.0;}
        System.out.println("Your CGPA equivalent = "+cgpa);*/

       /* System.out.println("Part 3 = Greetings");
        System.out.println("Enter your name here \n");
        String name = sc.nextLine();
        System.out.println("Hello "+name+" have a good day");*/

       /* System.out.println("Part 4 = Kilometer to mile converter");
        System.out.println("Enter distance in kilometers");
        double dist = sc.nextDouble();
        double now = dist/1.609;
        System.out.println("Distance in miles is "+now);*/

        System.out.println("Part 5 = Check for integer here");
        System.out.println("Enter any number here");
        if (sc.hasNextInt())
            System.out.println("Valid integer");

        else System.out.println("Not a valid integer");
    }}
