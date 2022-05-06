package RandomQuestions;

// codeforces problem 1670 "prof slim"
//  https://codeforces.com/contest/1670/problem/A?f0a28=1


public class CF1670 {
    public static void main(String[] args) {
        int[] arr = {71, -35, 7, -4, -11, -25}; // non-decreasing array
        int count = 0;
        for(int e: arr){
            if(e < 0) count++;
        }
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] > arr[i+1]) count--;
        }
        if(count!=0) System.out.println("No");
        else System.out.println("Yes");
    }
}
