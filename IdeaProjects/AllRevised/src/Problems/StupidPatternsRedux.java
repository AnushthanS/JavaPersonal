package Problems;

import java.util.Arrays;
import java.util.ArrayList;

public class StupidPatternsRedux {

    static void patternA1(){
        char[] arr=new char[4];
        Arrays.fill(arr,' ');
        for(int i=0;i<=3;i++){
            arr[i]='*';
            System.out.println(arr);
        }
    }
    static void patternA2(){
        ArrayList<Character> arr = new ArrayList<>();
        for(int i=0;i<=3;i++){
            arr.add(0,'*');
            System.out.println(arr);
        }
    }



    static void patternB1(){

    }
    public static void main(String[] args) {
        patternA1();
        patternA2();
    }
}
