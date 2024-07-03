package cWH;

import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        //Making a rock/paper/scissor game

        Scanner sc = new Scanner (System.in);
        System.out.println("Game will run for 5 rounds");

        System.out.println("Enter 0 for rock, 1 for paper, 2 for scissors ");

        /*java.util.Random can be used if rand.nextInt(n) is used,
        his will give an integer between 0(included) and n(not included)*/

        int game=0;
        while(game<=4)
        {   double comp = 3.0*Math.random();
            int fin = (int)comp;
            int inp = sc.nextInt();
            if (inp!=0&&inp!=1&&inp!=2) System.out.println("Enter a valid option only");
            if (inp==0 ){
                if (fin==0) System.out.println("Draw");
                else if (fin==1) System.out.println("Computer throws paper\nYou lose");
                else System.out.println("Computer throws scissor\nYou win");
            }
            if (inp==1 ){
                if (fin==1) System.out.println("Draw");
                else if (fin==2) System.out.println("Computer throws scissors\nYou lose");
                else System.out.println("Computer throws rock\nYou win");
            }
            if (inp==2 ){
                if (fin==2 )System.out.println("Draw");
                else if (fin==0) System.out.println("Computer throws rock\nYou lose");
                else System.out.println("Computer throws paper\nYou win"); }
            game++;
        }
    }
}
