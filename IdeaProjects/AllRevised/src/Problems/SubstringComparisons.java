package Problems;

import java.util.*;

public class SubstringComparisons {

    // Complete the function
    // 'smallest' must be the lexicographically smallest substring of length 'k'
    // 'largest' must be the lexicographically largest substring of length 'k'


    //throws is similar to comment basically
    public static String getSmallestAndLargest(String s,int k) throws IllegalArgumentException{
        s=s.trim();
        String largest=s.substring(0,k);
        String smallest=s.substring(0,k);

        //My method

        if(k>s.length()) throw new IllegalArgumentException();

        for(int i=0;i<=s.length()-k;i++){
            String temp=s.substring(i,i+k);
            if(temp.compareTo(smallest)<0) { //can't use compareToIgnoreCase because lexicographically A<a
                smallest=temp;}
            else if(temp.compareTo(largest)>0) {
                largest=temp;
            }
            else continue;
        }

        return smallest+"\n"+largest;
    }
    
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String s = scan.next();
        int k= scan.nextInt();
        scan.close();
        try {
            System.out.println(getSmallestAndLargest(s, k));
        }
        catch (IllegalArgumentException e){
            e.printStackTrace();
        }
    }
}
