package Problems;
import java.util.Scanner;
import java.lang.Math;

class HackerRankLoop2{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for (int i =0;i<t;i++)
        {
            int a=in.nextInt();
            int b=in.nextInt();
            int n=in.nextInt();
            double s=a+b;
            int sum;
            for(int j=1;j<=n;j++)
            {   sum=(int)s;
                System.out.print(sum+" ");
                s+=Math.pow(2,j)*b;
            }
            System.out.println();
        }
    }
}