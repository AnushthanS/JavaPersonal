package cWH;
import java.util.Scanner;

public class PracticeSet3 {
    public static void main(String[] args) {
        //Problem 1
        System.out.println("ANUSHTHAN".toLowerCase());

        //Problem 2
        System.out.println("This is Anushthan Saxena".replace(' ','_'));

        //Problem 3
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name");
        String name = sc.nextLine();
        String letter = "Dear <|person|>, thanks a lot!";
        letter = letter.replace("<|person|>",name);
        System.out.println(letter);

        //Problem 4
        String another="This string will have    triple and  double spaces";
        if (another.contains("  ")) System.out.println("Double space detected");
        if (another.indexOf("   ")!=-1) System.out.println("Triple space detected"); //another way of writing contains statement for this program
        else System.out.println("No double or triple spaces");

        //Problem 5
        System.out.println("Dear Harry,\nThis course is nice.\nThanks.");
    }
}
