package Problems;

import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String inp = sc.nextLine();
        boolean flag = true;
        char arr[] = inp.toLowerCase().toCharArray();
        String check = "abcdefghijklmnopqrstuvwxyz";
        for(Character c: arr){
            if(c < 65 || c > 90) continue;
            if(check.indexOf(c) == -1) {flag=false; break;}
        }
        System.out.println(flag? "Pangram":"Not Pangram");
    }
}
