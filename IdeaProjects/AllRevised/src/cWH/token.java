package cWH;

import java.util.StringTokenizer;
import static java.lang.System.*;
import java.util.Scanner;

public class token {
    public static void main(String[] args) {
//        StringTokenizer st = new StringTokenizer("This is the test string\n");
//        while(st.hasMoreTokens()){
//            out.println(st.nextToken()); //Note that newline is ignored
//        }
//        out.println();
//
//        StringTokenizer st2 = new StringTokenizer("This : is : the : second : constructor"," :");
//        while (st2.hasMoreTokens()) out.println(st2.nextToken());
//
//        out.println();
//
//        StringTokenizer st3 = new StringTokenizer("This : is : the : third : constructor"," :",true);
//        out.println(st3.countTokens());
//        while (st3.hasMoreTokens()) out.println(st3.nextToken());

        Scanner sc=new Scanner(in);
        //HackerRank question
        // is composed of the following: English alphabetic letters, blank spaces, exclamation points (!),
        // commas (,),question marks (?), periods (.), underscores (_), apostrophes ('), and at symbols (@).
        StringTokenizer stProb = new StringTokenizer(sc.nextLine()," ?!,._'@",false);
        out.println(stProb.countTokens());
        while (stProb.hasMoreTokens()) out.println(stProb.nextToken());
    }
}
