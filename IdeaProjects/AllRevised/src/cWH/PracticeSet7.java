package cWH;

public class PracticeSet7 {

    static void table (int n) { //Problem 1
        for(int i=1;i<=10;i++){
            System.out.printf("%d x %d = %d\n",n,i,n*i);
        }
    }

    static void star(int n){ //Problem 2
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int sum(int n){ //Problem 3
        if (n==1) return 1;
        else return n+sum(n-1);
    }

    static void InStar(int n){ //Problem 4
        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int termF(int n){ //Problem 5
        if(n==1||n==0) return n;
        else return termF(n-1)+termF(n-2);
    }

    static float avg (float ...arr){ //Problem 6
        float sum=0.0f;
        for(float a: arr){
            sum+=a;
        }
        return sum/arr.length;
    }

    static  void RecInStar(int n){ //Problem 7

        if(n>0){
        for(int i=1;i<=n;i++){
            System.out.print("* ");
                         }
        System.out.println();
            RecInStar(n-1);
            }
    }

    static void RecStar (int n){ //Problem 8
        if(n>0){
            RecStar(n-1);
            for(int i=1;i<=n;i++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static float Temp(float C){ //Problem 9
        float F = 9*C/5 +32.0f;
        return F;
    }

    static int sum10(int n){ //Problem 10
        int sum=0;
        for (int i=n;i>0;i--){
            sum +=i;
        }return sum;
    }

    public static void main(String[] args) {
        table(19);
        star(4);
        System.out.printf("Sum of %d natural numbers = %d\n",10,sum(10));
        InStar(4);
        System.out.printf("The %dth term of Fibonacci is : %d\n",5,termF(5));
        System.out.printf("The Average of %.3f,%.3f and %.3f = %.3f\n",6.95f,7.35f,8.10f,avg(6.95f,7.35f,8.10f) );
        RecInStar(4);
        RecStar(4);
        System.out.printf("%.2fC is equivalent to %.2fF\n",32.0f,Temp(32.0f));
        System.out.printf("The sum of %d natural numbers = %d",10,sum10(10));
    }
}
