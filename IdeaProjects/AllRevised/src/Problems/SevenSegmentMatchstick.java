package Problems;
import java.io.*;

// From HackerEarth https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/seven-segment-display-nov-easy-e7f87ce0/
// Given a number displayed on a 7 segment display made of matchsticks, take the number of matchsticks which must have
// been required for the given number and construct the largest possible number with it.

// First line is the input T for the number of test cases
// Second line is the number to check for the number
public class SevenSegmentMatchstick {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-- >0){
            String out="";
            String num = br.readLine();
            int matches = noOfMatchsticks(num);
            switch (matches % 2) {
                case 0 -> {
                    out = "";
                    while (matches > 0) {
                        out += '1';
                        matches -= 2;
                    }
                }
                case 1 -> {
                    out = "7";
                    matches -= 3;
                    while (matches > 0) {
                        out += '1';
                        matches -= 2;
                    }
                }
            }
            System.out.println(out);
        }
    }
    public static int noOfMatchsticks(String num){
        int total = 0;
        int[] match = {6,2,5,5,4,5,6,3,7,6};
        for(int i=0; i<num.length(); i++){
            total+=match[num.charAt(i)-'0'];
        }
        return total;
    }
}
