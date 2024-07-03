package Problems;
import java.util.Arrays;
import java.util.Scanner;
//for n=6
//     #
//    ##
//   ###
//  ####
// #####
//######
public class StaircasePattern {
    static void method1(int n){
        for(int i=n;i>0;i--){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int k=n;k>=i;k--){
                System.out.print("#");
            }
            System.out.println();
        }
    }

    static void method2(int n){
        char [] arr= new char[n];
        Arrays.fill(arr,' ');
        for(int i=0;i<n;i++){
            arr[n-i-1]='#';
            System.out.println(arr);
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        method1(n);
        System.out.println();
        method2(n);
    }
}
