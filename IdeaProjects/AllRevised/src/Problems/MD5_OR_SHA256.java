package Problems;

import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import java.util.Scanner;

public class MD5_OR_SHA256 {
    public static void main(String[] args) throws NoSuchAlgorithmException{
        Scanner sc = new Scanner(System.in);
        MessageDigest m = MessageDigest.getInstance("MD5"); //or SHA-256
        m.reset();
        m.update(sc.nextLine().getBytes());
        for(byte b: m.digest()){
            System.out.format("%02x", b);
        }
        System.out.println();
        sc.close();
    }
}
