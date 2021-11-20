package Problems;

import java.util.*;
import java.math.BigDecimal;

public class BigDecimalHRProblem {


    //Given an array ,s , of n real number strings, sort them in descending order — but wait, there's more! Each number must be printed in the exact same format as it was read from stdin, meaning that .1 is printed as .1, and 0.1 is printed as 0.1 . If two numbers represent numerically equivalent values (e.g .1=0.1), then they must be listed in the same order as they were received as input).


    public static void main(String[] args) {

        //Input as given in problem, locked in editor
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String[] s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //My Code
        Arrays.sort(s, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1==null || o2==null) return 0;
                BigDecimal b1= new BigDecimal(o1);
                BigDecimal b2= new BigDecimal(o2);
                return b1.compareTo(b2);
            }
        });

        //Anonymous class
        Arrays.sort(s, Collections.reverseOrder(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1==null || o2==null) return 0;
                else {
                    BigDecimal b1=new BigDecimal(o1);
                    BigDecimal b2=new BigDecimal(o2);
                    return b1.compareTo(b2);
                }
            }
        }));

        //Output as given in problem, locked in editor
        for(int i=0;i<n;i++){
            System.out.println(s[i]);
        }
    }
}
