package Problems;
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

//Sample inputs
//4
//12345
//31203
//2123
//2300

/* Name of the class has to be "Main" only if the class is public. */
class ReverseNumberNoZero
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here

            Scanner sc=new Scanner(System.in);
            int T =sc.nextInt();
            for(int i=0;i<T;i++){
                String res = new StringBuilder(sc.next()).reverse().toString();
                if(res.charAt(0) == '0') {
                    System.out.println(res.substring(res.lastIndexOf('0')+1));
                    continue;
                }
                System.out.println(res);
            }


    }
}
