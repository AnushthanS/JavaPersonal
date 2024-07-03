package cWH;

import java.io.File;

public class FileCreation {
    public static void main(String[] args) {
        File myFile=new File("FirstFileJv.txt");
        //File myCustomFile=new File("~/Development/NotesPersonal/RandomFileGenerated.txt"); Can't add to any other path except the project folder
        try{
            myFile.createNewFile();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
