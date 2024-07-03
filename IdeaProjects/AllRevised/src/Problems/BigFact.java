package Problems;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFact {
    private static BigInteger factorial(int n){
        if(n==0) return BigInteger.ONE;
        else return BigInteger.valueOf(n).multiply(factorial(n-1));
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int T=scanner.nextInt();
        for(int i=0;i<T;i++){
            System.out.println(factorial(scanner.nextInt()));
        }
    }
}
