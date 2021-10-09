package cWH;
import java.util.Scanner;

public class cwh5_6ex {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
            System.out.println("For marks out of 100");
        System.out.println("Enter marks for sub1");
        int m1 = sc.nextInt();
        System.out.println("Enter marks for sub2");
        int m2 = sc.nextInt();
        System.out.println("Enter marks for sub3");
        int m3 = sc.nextInt();
        System.out.println("Enter marks for sub4");
        int m4 = sc.nextInt();
        System.out.println("Enter marks for sub5");
        int m5 = sc.nextInt();
        int total = m1+m2+m3+m4+m5;
        double per = ((double)total)/5;
        System.out.println("Percentage achieved : "+per);
    }
}
