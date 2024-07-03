package RandomQuestions;

import java.util.ArrayList;
import java.util.Arrays;

// https://www.youtube.com/watch?v=fzip9Aml6og&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=25

public class BitwiseShortcuts {
    public static void main(String[] args) {
//        System.out.println(evenCheckBit(9992)?"Even":"Odd");
//        Integer[] arr = {2,3,4,1,2,1,3,6,4};
//        System.out.println(repetitionCheck(arr));
//        System.out.println(getSpecificBit(22,3));
//        System.out.println(setSpecificBit(22,4)); //0 1 0 1 1 0
//        System.out.println(magicNumber(5));
//        System.out.println(pascalRowSum(6));
//        System.out.println(isPowerOf2(32));
//        System.out.println(rightSetBit(12));
//        System.out.println(power(3,6));
//        System.out.println(Integer.toBinaryString(127)+" = "+noOfSetBits(127) + " set bits");
//        System.out.println(xorRangeFromZero(6));
//        System.out.println(xorRangeAtoB(3, 9));

        int[][] image = {
                {1,1,0},
                {1,0,1},
                {0,0,1}
        };
        flipImage(image);
        System.out.println(Arrays.deepToString(image));
    }

    private static int xorRangeAtoB(int a, int b) {
        int ans1, ans2, ans;
        //basically, take xor from 0 to b and then xor from 0 to a-1
        ans1 = xorRangeFromZero(b);
        ans2 = xorRangeFromZero(a-1);
        ans = ans1 ^ ans2;
        return ans;
    }

    private static int noOfSetBits(int n) {
        int count = 0;
//        while(n>0){
//            count++;
//            n -= (n & -n);
//        }
        while(n > 0){
            count++;
            n = n & (n-1);
        }
        return count;
    }

    private static boolean evenCheckBit(Integer n){
        return (n&1)==0; //alternatively (n^1)==n+1 iff n is even
    }

    // In a given array, except a certain element which appears once, every other element appears twice. Find this exception.
    private static int repetitionCheck(Integer[] arr){
        Integer element = 0;
        for(Integer e: arr) element^=e;
        return element;
    }

    // Find i th bit of a given number
    // 8 7 6 5 4 3 2 1 indexing for the number below
    // 1 0 1 1 0 1 1 0
    private static int getSpecificBit(int n, int i){
        return (n & (int)Math.pow(2,i-1)); // or 1<<(i-1) & n
    }

    // Set a specific bit to 1
    private static int setSpecificBit(int n, int i){
        return n | (1<<(i-1));
    }

    private  static void printExceptionElement(Integer[] arr){
        ArrayList<Integer> set = new ArrayList<>();
        for(Integer e: arr){

        }
    }

    private static int rightSetBit(int n){
        return (n & -n); // -n is (~n + 1)
    }

    private static int magicNumber(int n){
        int magic = 0;
//        int count=0;
//        while(n>0){
//            count++;
//            if((n&1) == 1){
//                magic += Math.pow(5,count);
//            }
//            n>>=1;
//        }
        int base = 5;
        while(n>0){
            int lsb = n & 1;
            n>>=1;
            magic += lsb * base;
            base *= 5;
        }
        return magic;
    }

    private static long pascalRowSum(int n){
        return 1l<<(n-1);
    }
    private static boolean isPowerOf2(int n){
        if(n==0) return false;
        return (n & ( n - 1)) == 0;
    }
    private static long power(int a, int b){ // a to the power b
        long ans = 1;
        int loop = 0;
        while(b>0){
            loop++;
            int bit = b & 1;
            if(bit == 1) ans = ans * a;
            a *= a;
            b >>= 1;
        }
        System.out.println(loop);
        return ans;
    }
    private static int xorRangeFromZero(int n){
        // given a number a, return xor of numbers from 0 to a
        int ans=0;
//        for(int i=1; i<=n; i++){
//            ans = ans ^ i;
//        }
        int control = n % 4;
        switch (control){
            case 0 -> ans = n;
            case 1 -> ans = 1;
            case 2 -> ans = n+1; // already set ans = 0 for case 3
        }
        return ans;
    }
    private static void flipImage(int[][] image){
        // https://leetcode.com/problems/flipping-an-image/
        // q832
        for(int[] row: image){
            // reverse the row, invert the bits
            for(int i = 0; i < (row.length + 1)/2; i++){
                //swap and flip at the same time
                int temp = row[i];
                row[i] = row[row.length-i-1] ^ 1;
                row[row.length-i-1] = temp ^ 1;
            }
        }
    }
}
