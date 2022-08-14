package cWH;

import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import cWH.FastReader;

/**
 * FastIO is primarily used for competitive programming, where multiple test cases
 * make the input and output a significant part of the code.
 */
public class FastIO {
    public static void main(String[] args) {

    }

    /**
     * Use StringBuilder to get the answer for each test case and append it to the object's end
     * Then print the object as the output for the fastest output possible
     */
    private static void fastOutput(){
        StringBuilder stringBuilder = new StringBuilder();
        int t = 10; //No. of testcases
        while(t-- >0){
            stringBuilder.append("answer");
        }
        System.out.println(stringBuilder);
    }
    // The slowest input method
    private static void scannerInput(){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(input);
    }

    /**
     * A Buffered Reader is better than scanner since it takes in the whole input stream
     * as a collection of characters instead of parsing them before taking the input like Scanner does.
     */
    private static void bufferedReaderInput() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        String input1 = stringTokenizer.nextToken();
        String input2 = stringTokenizer.nextToken();
        System.out.println(input1 + input2);
    }

    /**
     * Use a FastReader custom class
     */
    private static void fastReaderInput(){
        FastReader fastReader = new FastReader();
        int n = fastReader.nextInt();
        String input = fastReader.nextLine();
        System.out.println(n + input);
    }
}
