package cWH;

import java.io.File;

public class FileDeletion {
    public static void main(String[] args) {
        File myFile=new File("FirstFileJv.txt");
        if(myFile.delete()) System.out.println("Deleted successfully");
        else System.out.println("No such file");
    }
}
