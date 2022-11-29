package cWH;

import java.io.FileWriter;

public class FileWriting {
    public static void main(String[] args) {
        try{
            FileWriter fileWriter = new FileWriter("FirstFileJv.txt");
            fileWriter.write("A random sentence written through FileWriter\nNote that all these file handling methods usually throw Exceptions");
            fileWriter.close();//Will not write anything if not closed
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
