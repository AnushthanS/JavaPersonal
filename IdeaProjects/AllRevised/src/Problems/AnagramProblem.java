package Problems;
import java.util.Arrays;
import java.util.Scanner;

//We have to create a static method boolean isAnagram which checks if the two given strings are anagrams or not
public class AnagramProblem {

    static boolean isAnagram(String a, String b) {
        if(a==null||b==null)
            throw new IllegalArgumentException();

        //My method
       /* boolean flag = false;
        String a1=a.toLowerCase(),b1=b.toLowerCase();

        if(a1.length()==b1.length()){
            outer: for(int i=0;i<a1.length();i++){
                int count1=0,count2=0;
                char k= a1.charAt(i);
                for(int j=0;j<a.length();j++) {
                    if (k == a1.charAt(j)) count1++;
                    if (k == b1.charAt(j)) count2++;
                }
                if(count1==count2) flag = true;
                else {
                    flag = false;
                    break outer;
                }
            }
        }
        return flag;*/

        //Alternate methods I found
        //1-->
        /*char aa[]= a.toLowerCase().toCharArray();
        char bb[]= b.toLowerCase().toCharArray();
        if(aa.length!=bb.length) return false;
        else {
            Arrays.sort(aa);
            Arrays.sort(bb);
            return Arrays.equals(aa,bb);
        }*/

        //2-->
        if (a.length() != b.length()) return false;

        a = a.toLowerCase();
        b = b.toLowerCase();
        int sum = 0;
        outer:
        for (char c = 'a'; c <= 'z'; c++) {
            inner:
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == c) sum++;
                if (b.charAt(i) == c) sum--;
            }
            if (sum != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        boolean ret= isAnagram(a,b);
        System.out.println(ret? "Yes":"No");
    }
}
