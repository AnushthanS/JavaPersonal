package cWH;

public class FibonacciRecursion {
    static void fiboIt(int n)
    {
        int a=0,b=1,c;
        System.out.printf("0,1");
        for (int i=1;i<n-1;i++)
        {
            c=a+b;
            System.out.printf(",%d",c);
            a=b;
            b=c;
        }
    }
    static int fiboRec(int n)
    {   if (n<=1) return 1;
        else return fiboRec(n-1)+fiboRec(n-2);
    }
    public static void main(String[] args) {
        /*//Fibonacci the normal way
        int a=0,b=1,c;
        int n=10;
        System.out.print("0,1");
        for(int i=1;i<n-1;i++)
        {
            c=a+b;
            System.out.printf(",%d",c);
            a=b;
            b=c;
        }*/

        /*//Iterative version
        System.out.printf("Fibonacci for 10 terms : ");
        fiboIt(10);*/
        int n=10;
        for (int i=1;i<=n;i++)
        {
            System.out.printf("0,1,%d",fiboRec(i));
        }
    }
}
