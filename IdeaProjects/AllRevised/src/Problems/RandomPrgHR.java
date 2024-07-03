package Problems;
import java.util.Scanner;

public class RandomPrgHR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 100");
        int n = sc.nextInt();

        if (n%2==0){
            if (n>=2&&n<5){
                System.out.println("Not Weird");
            }
            if (n>=6&&n<=20){
                System.out.println("Weird");
            }
            if(n>20){
                System.out.println("Not Weird");
            }
        }
        else {System.out.println("Weird");}
    }
}

