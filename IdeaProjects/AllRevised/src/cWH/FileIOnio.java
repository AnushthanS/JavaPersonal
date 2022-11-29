package cWH;

import java.io.*;

public class FileIOnio {
    public static void main(String[] args) {
        try{
            BufferedWriter fileWriter;
            File file = new File("input.txt");
            if(file.createNewFile()) {
                fileWriter = new BufferedWriter(new FileWriter("input.txt"));
                fileWriter.write("This is a sample input in the file input.txt");
                fileWriter.close();
            }
            BufferedReader fileReader = new BufferedReader(new FileReader("input.txt"));
            file = new File("output.txt");
            if(file.createNewFile()){
                fileWriter = new BufferedWriter(new FileWriter("output.txt"));
                String line;
                while((line = fileReader.readLine())!=null){
                    fileWriter.write(line);
                }
                fileWriter.close();
                fileReader.close();
            }
        } catch (Exception e1){
            e1.printStackTrace();
        }
    }
}
