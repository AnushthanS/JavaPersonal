package ManagingPackages;

import java.util.Scanner;

public  class HybridCalculator{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        System.out.printf("The sum of %d and %d is %d\n",a,b,a+b);
        System.out.printf("The area of a circle of radius %d is %f",a,(float)Math.PI*a*a);
    }
}