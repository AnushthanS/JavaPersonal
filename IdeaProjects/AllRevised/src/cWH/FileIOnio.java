package cWH;

import java.io.*;

public class FileIOnio {
    public static void main(String[] args) {
        try{

            BufferedReader fileReader = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter("output.txt"));

            String line = "";
            while((line = fileReader.readLine()) != null){
                fileWriter.write(line);
            }
        } catch (Exception e1){
            e1.printStackTrace();
        }
    }
}
