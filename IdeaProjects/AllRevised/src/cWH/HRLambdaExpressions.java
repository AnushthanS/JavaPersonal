package cWH;
// https://www.hackerrank.com/challenges/java-lambda-expressions/problem?isFullScreen=true
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class HRLambdaExpressions {
    public static void main(String[] args) throws IOException {
        MyMath ob=new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        PerformOperation op;

        
        String ans = null;
        while(T-->0){
            String s = br.readLine().trim();
            StringTokenizer st= new StringTokenizer(s);
            int ch=Integer.parseInt(st.nextToken());
            int num=Integer.parseInt(st.nextToken());

            boolean ret;
            if(ch==1){
                op=ob.isOdd();
                ret =ob.checker(op, num);
                ans = (ret)?"ODD":"EVEN";
            } else if(ch ==2){
                op=ob.isPrime();
                ret=ob.checker(op,num);
                ans=(ret)?"PRIME":"COMPOSITE";
            } else if(ch==3){
                op=ob.isPalindrome();
                ret=ob.checker(op,num);
                ans=(ret)?"PALINDROME":"NOT PALINDROME";
            }
            System.out.println(ans);
        }
    }
}

interface PerformOperation{
    boolean check(int a);
}

class MyMath{
    public  boolean checker(PerformOperation p, int num){
        return p.check(num);
    }

    public  PerformOperation isOdd(){
        return (int a)->a%2!=0;
    }
    public  PerformOperation isPrime(){
        return (int a)-> BigInteger.valueOf(a).isProbablePrime(100);
    }
    public  PerformOperation isPalindrome(){
        return (int a)-> Integer.toString(a).equals(new StringBuilder(Integer.toString(a)).reverse().toString());
    }
//My code here everything else locked
}


