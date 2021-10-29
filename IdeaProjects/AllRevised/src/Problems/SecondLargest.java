package Problems;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++){
            int[] arr={sc.nextInt(),sc.nextInt(),sc.nextInt()};
            Arrays.sort(arr);
            System.out.println(arr[1]);
        }
    }
}
