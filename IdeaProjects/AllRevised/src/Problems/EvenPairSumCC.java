package Problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;

 //https://www.codechef.com/problems/EVENPSUM

public class EvenPairSumCC {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        while(t-->0){
            String st[] = bufferedReader.readLine().split(" ");
            int a = Integer.parseInt(st[0]);
            int b = Integer.parseInt(st[1]);
            System.out.println(sum(a,b));
        }
    }
    static long sum(int a, int b){
        long oddA=0, evenA=0, oddB = 0, evenB = 0;
        oddA = a%2==0 ? a/2 : a/2 +1;
        evenA = a/2;
        oddB = b%2==0 ? b/2 : b/2 +1;
        evenB = b/2;
        return oddA*oddB + evenA*evenB;
    }
}

//           Blunt method
//           int count=0;
//           for(int i=1; i<=a; i++){
//               for(int j=1; j<=b; j++){
//                   if((i+j)%2==0) count++;
//               }
//           }