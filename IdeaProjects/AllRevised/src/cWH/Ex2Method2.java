package cWH;

import java.util.Scanner;
import java.util.Random;

public class Ex2Method2 {
    public static void main(String[] args)
    {
        System.out.println("This  game will run for 5 rounds.\nWinner will be declared on the best of 5 basis.\nNo one gets a point on draws");
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int game=0,tally=0,tallyC=0,draw=0;
        int next,inp;
        System.out.println("Enter 0 for rock\nEnter 1 for paper\nEnter 2 for scissors.\n\n");
        while (game<=4)
        {
            System.out.println("Your throw");
            next = ran.nextInt(3);
            inp=sc.nextInt();
            if (inp!=0&&inp!=1&&inp!=2) {System.out.println("Enter a valid choice");
            game--;}
            if(inp==0)
            {
                System.out.println("You throw rock.");
                if (next==0){

                    System.out.println("Computer throws rock.\nDraw.");
                draw++;}
                else if(next==1)
                {
                    System.out.println("Computer throws paper.\nComputer wins this round.");
                    ++tallyC;
                }
                else
                {
                    System.out.println("Computer throws scissors.\nYou win this round.");
                    tally++;
                }
            }
            if(inp==1)
            {
                System.out.println("You throw paper.");
                if (next==1){
                    System.out.println("Computer throws paper.\nDraw.");
                    draw++;}
                else if(next==2)
                {
                    System.out.println("Computer throws scissors.\nComputer wins this round.");
                    ++tallyC;
                }
                else
                {
                    System.out.println("Computer throws rock.\nYou win this round.");
                    tally++;
                }
            }
            if(inp==2)
            {
                System.out.println("You throw scissors.");
                if (next==2){
                    System.out.println("Computer throws scissors.\nDraw.");
                    draw++;}
                else if(next==0)
                {
                    System.out.println("Computer throws rock.\nComputer wins this round.");
                    ++tallyC;
                }
                else
                {
                    System.out.println("Computer throws paper.\nYou win this round.");
                    tally++;
                }
            }


            /*if(inp==next) //BEST VERSION
            {
                System.out.println("draw");
            }
            else if ((inp==0&&next==2)||(inp==1&next==0)||(inp==2&&next==1)
            {
            System.out.println("You win");}
            else
            { System.out.println("Computer wins");}
            }*/


            System.out.println();
            game++;
        }
        if (tally>tallyC){
            System.out.println("You win the game.");
        }
        else System.out.println("Computer wins.");
        System.out.println("You won "+tally+" rounds");
        System.out.println("Computer won "+tallyC+" rounds");
        System.out.println("Draws : "+draw);
    }
}
