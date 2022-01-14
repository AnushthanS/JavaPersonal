package Problems;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.regex.*;

public class StringVowel {
    public static void main(String[] args) {
        //bbaaabcbeea
        /*String S. consisting of lower case alphabets
at most 2 substring removal
finally should only have vowels


string

anushthan
char array
97-122
97
101
105
111
118
         */

        Scanner sc = new Scanner(System.in);
        int T= sc.nextInt();
        while(T-- >0){
            int count=0;
            String str = sc.next();
            Pattern p = Pattern.compile("([^aeiou])");
            Matcher m = p.matcher(str);

            while(m.find()){
                 str = str.replaceAll(m.group(), "");
            }

            System.out.println(str);
            System.out.println(count);
        }
    }
}
