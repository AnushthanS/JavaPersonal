package Problems;

import java.util.Scanner;

public class StringInitializationProblemHR {

    static String convertStr(String S){
        String temp = ""+S.charAt(0);
        return(temp.toUpperCase()+S.substring(1));
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String A= sc.nextLine();
        String B= sc.nextLine();
        System.out.println(A.length()+B.length());
        System.out.println(A.compareToIgnoreCase(B)>0? "Yes":"No");
        System.out.printf("%s %s",convertStr(A),convertStr(B));
    }
}
