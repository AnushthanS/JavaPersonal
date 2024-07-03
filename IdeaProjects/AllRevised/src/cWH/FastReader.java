package cWH;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FastReader {
    BufferedReader bufferedReader;
    StringTokenizer stringTokenizer;

    public FastReader(){
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }
    String next(){
        while (stringTokenizer == null || !stringTokenizer.hasMoreElements()){
            try{
                stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            } catch (IOException e){
                e.printStackTrace();
            }
        }
        return stringTokenizer.nextToken();
    }
    int nextInt(){
        return Integer.parseInt(next());
    }

    long nextLong(){
        return Long.parseLong(next());
    }
    double nextDouble(){
        return Double.parseDouble(next());
    }
    String nextLine(){
        String str = "";
        try {
            if(stringTokenizer.hasMoreTokens()){
                str = stringTokenizer.nextToken();
            } else {
                str = bufferedReader.readLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return str;
    }
}
