package Problems;

import java.util.Scanner;

//codechef problem
public class ATM {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double req = sc.nextDouble();
        double bal = sc.nextDouble();
        if(req%5==0){
            if(bal>=req-0.5){
                bal = bal-req-0.5;
            }
        }
        System.out.printf("%.2f",bal);
    }
}
