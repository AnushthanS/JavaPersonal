package cWH;

public class FactorialRecursion {
    static int Factorial(int n) {
        if (n == 0) return 1;
        else {
            return n * Factorial(n - 1);
        }
    }

    static int Factorial_iterative(int n) {
        if (n == 0) return 1;
        else {
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            return fact;
        }
    }

    public static void main(String[] args)
    {
        System.out.printf("The factorial of &d is : %d\n",5,Factorial(5));
        System.out.printf("The factorial of %d is : %d\n",7,Factorial_iterative(7));
    }
}
