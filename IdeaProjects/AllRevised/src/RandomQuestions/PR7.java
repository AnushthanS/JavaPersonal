package RandomQuestions;

//Doing Practice Set 7 once more

import java.util.Scanner;
import java.util.ArrayList;

public class PR7 {

    static void table(int n){
        for(int i=1;i<=n;i++){
            System.out.printf("%d x %d = %d\n",n,i,n*i);
        }
    }

    static void star(){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int sum(int n){
        if(n==0) return 0;
        else return n+sum(n-1);
    }

    static void invStar(){
        for(int i =4;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //0,1,1,2,3,5,8,13,21,... starting terms are 0,1
    //Following terms are sum of previous 2 terms
    static int fibonacciTerm(int n){
      if(n==0 || n==1) return n;
      else return fibonacciTerm(n-1)+fibonacciTerm(n-2);
    }

    static double average(ArrayList<Integer> l1){
        double sum=0.0;
        for (Integer integer : l1) {
            sum += integer;
        }
        return sum/l1.size();
    }

    static void recursionStarRegular(int n){
        if(n>0){
            for(int i=1;i<=n;i++){
                System.out.print("* ");
            }
            System.out.println();
            recursionStarRegular(n-1);
        }
    }

    static void recursionStarInverted(int n){
        if(n>0){
            recursionStarInverted(n-1);
            for(int i=1;i<=n;i++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static long factorial(int i){
        if(i==0) return 1;
        else return i*factorial(i-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //table
        table(sc.nextInt());

        //star regular no recursion
        star();

        //sum of natural numbers
        System.out.println(sum(sc.nextInt()));

        //star inverted no recursion
        invStar();

        //fibonacci
        System.out.println(fibonacciTerm(sc.nextInt()));

        //Average
        ArrayList<Integer> l1= new ArrayList<>();
        while(true){
            if(sc.nextInt()==0) break;
            else l1.add(sc.nextInt());
        }
        System.out.println(average(l1));

        //factorial
        System.out.println(factorial(sc.nextInt()));

        sc.close();
    }
}
