package Problems;
/*
Print the following patterns using loop :
a-->
*
**
***
****

b-->
  *
 ***
*****
 ***
  *

c-->
1010101
 10101
  101
   1
 */


public class StupidPatterns {
    public static void main(String[] args){
        //Problem a-->
        for(int i=0;i<4;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();


        //Problem b-->
        for(int i=0;i<3;i++){
            for(int j=2;j>i;j--){
                System.out.print(" ");
            }
            for( int k=2*i+1;k>0;k--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=2;i>0;i--){
            for(int j=2;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();


        //Problem c-->
        for(int i=4;i>0;i--){
            for(int j=4;j>i;j--){
                System.out.print(" ");
            }
            for(int k=2*i-1;k>0;k--){
                if(k%2==0) System.out.print("0");
                else System.out.print("1");
            }
            System.out.println();
        }
        System.out.println();
    }
}
