package cWH;

import java.util.Scanner;
import java.util.regex.*;

public class CheckForValidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases= sc.nextInt();
        while(testCases-- >0){
            try{
                Pattern.compile(sc.nextLine());
                System.out.println("Valid");
            }
            catch (Exception e){
                System.out.println("Invalid");
            }
        }
    }
}
