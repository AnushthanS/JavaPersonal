package cWH;

import java.io.File;
import java.util.Scanner;

public class FileScanning {
    public static void main(String[] args) {
        File myFile=new File("FirstFileJv.txt");
        try {
            Scanner sc=new Scanner(myFile);
            while(sc.hasNext()){
                System.out.println(sc.nextLine());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
