package  RandomQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class FiboRecIt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter term number:");
        int n = sc.nextInt();
        if (n==0 || n==1) {
            System.out.println(n);
            return;
        }
        System.out.println("0: recursive\n1: iterative");
        int control = sc.nextInt();
        switch (control){
            case 0-> System.out.println(fiboRec(n));
            case 1-> System.out.println(fiboIt(n));
            default -> System.out.println();
        }
    }
    static long fiboIt(int n){
        ArrayList<Long> fiboArr = new ArrayList<>();
        fiboArr.add(0L);
        fiboArr.add(1L);
        for(int i = 2; i<=n; i++){
            long a = fiboArr.get(i-2);
            long b = fiboArr.get(i-1);
            fiboArr.add(i,a+b);
        }
        return fiboArr.get(n);
    }

    static long fiboRec(int n){
        if(n==0 || n==1) return n;
        return fiboRec(n-1) + fiboRec(n-2);
    }
}