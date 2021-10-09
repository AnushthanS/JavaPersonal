package cWH;
import java.util.Scanner;
public class PracticeSet4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      /* Problem 2

        int m1, m2, m3;
        System.out.println("Enter marks for subject 1");
        m1 = sc.nextInt();
        System.out.println("Enter marks for subject 2");
        m2 = sc.nextInt();
        System.out.println("Enter marks for subject 3");
        m3 = sc.nextInt();
        float total = (float)m1+m2+m3;
        float percent= total/3.0f;
        if(percent>=40 && m1>33&& m2>33 &&m3>33){
            System.out.println("You shall pass");
        }
        else System.out.println("You shall not pass");*/

       /* Problem 3
        System.out.println("Enter your income below(in lakhs)");
        float inc = sc.nextFloat();
        float tax=0.0f;
        if(inc<=2.5f)
        {
            System.out.println("Ineligible to pay tax");
        }
        else if (inc>2.5f&&inc<=5f)
        {
            tax += 0.05*(inc-2.5f);
        }
        else if (inc>5f&&inc<=10f)
        {
            tax += 0.05*2.5f + 0.2*(inc-5f);
        }
        else if (inc>10f)
        {
            tax += 0.05*2.5f + 0.2*5f + 0.3*(inc-10f);
        }
        System.out.println("Tax : "+tax);*/

       /* Problem 4
        System.out.println("Enter the number for day");
        int day = sc.nextInt();
        switch(day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid input");
        }*/

        /*Problem 5
        System.out.println("Enter the current year");
        int year = sc.nextInt();
        if (year%4==0)
        {
            if(year%100==0&&year%400==0 || year%100!=0){
                System.out.println("Leap year");
            }
            else System.out.println("Not a leap year");
        }
        else System.out.println("Not a leap year");*/

        //Problem 5 another
        System.out.println("Enter the year to be checked");
        int year = sc.nextInt();
        if(year%4==0)
        {
            if(year%100==0)
            {
                if (year%400==0) System.out.println("Leap year");
                else System.out.println("Not a leap year");
            }
            else System.out.println("Leap year");
        }
        else System.out.println("Not a leap year");

       /* Problem 6
        System.out.println("Enter the website under question");
        String website = new String(sc.nextLine());
        if (website.endsWith(".com")){
            System.out.println("Commercial website");
        }
        else if (website.endsWith(".org")){
            System.out.println("Website representing an organisation");
        }
        else if (website.endsWith(".in")){
            System.out.println("Indian website");
        }
        else System.out.println("Irregular domain");*/
    }}