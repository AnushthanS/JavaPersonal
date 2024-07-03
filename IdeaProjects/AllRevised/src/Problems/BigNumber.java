package Problems;

import java.io.*;
import java.math.BigInteger;

public class BigNumber {
    public static void main(String[] args) {
        try{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger a = new BigInteger(br.readLine());
        BigInteger b = new BigInteger(br.readLine());
            System.out.println(a.add(b));
            System.out.println(a.multiply(b));
        }
        catch (Exception e){e.printStackTrace();}
    }
}
