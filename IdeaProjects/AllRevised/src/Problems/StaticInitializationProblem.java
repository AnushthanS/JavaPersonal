package Problems;

import java.util.Scanner;

public class StaticInitializationProblem {
    static Scanner sc = new Scanner(System.in);
    static int B = sc.nextInt();
    static int H = sc.nextInt();
    static boolean flag = true;
    static{
             try {
                if (B < 0 || H < 0) {
                    flag = false;
                    throw new Exception("Breadth and height must be positive");
                    }
             }
             catch (Exception e) {
                System.out.println(e);
            }
    }

    public static void main(String[] args) {
        if(flag){
            System.out.print(B*H);
        }
    }
}
