package Problems;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        while(m != n){
            if(m > n) m-=n;
            else n-=m;
        }
        System.out.println(n);
    }
}
