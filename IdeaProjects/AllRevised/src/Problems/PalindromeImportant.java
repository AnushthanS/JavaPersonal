package Problems;
//Palindrome check
import java.util.Scanner;

public class PalindromeImportant {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String A = sc.nextLine();

        //My method as a beginner/amateur, not bad at all
        /*String k="";
        for(int i = A.length()-1;i>=0;i--){
            k+=A.charAt(i);
        }
        System.out.println(k.equalsIgnoreCase(A)? "Yes":"No");*/

        /*//The one which blew me away

        System.out.println(A.equals(new StringBuilder(A).reverse().toString())?"Yes":"No");

        //Another one I found
        int count = 0;
        for(int i=0; i<A.length()/2;i++)
        {if( A.charAt(i) == A.charAt(A.length()-i-1)) count++;}
        System.out.println( (count == A.length()/2) ? "Yes" : "No") ;
*/
        //Another method I found
        boolean flag = true;
        int i,j;
        for(i=0, j=A.length()-1;i<=j;i++,j--){
            if(A.charAt(i)!=A.charAt(j))flag = false;
        }
        System.out.println(flag? "Yes":"No");
    }
}
