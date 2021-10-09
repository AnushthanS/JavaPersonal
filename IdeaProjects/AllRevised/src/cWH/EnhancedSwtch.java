package cWH;
import java.util.Scanner;

public class EnhancedSwtch {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int inpIn = sc.nextInt();
    switch (inpIn){
        case 10 -> System.out.println("Preferred");
        case 20 -> System.out.println("Not preferred");
        default -> System.out.println("Enhanced switch");
    }


    /*Doing this the old way
    switch (impIn)
    {
    case 10: System.out.println("Preferred");
    break;
    case 20: System.out.println("NOt preferred");
    break;
    default: System.out.println("Classic switch");
    break;
    } */

    }
}
