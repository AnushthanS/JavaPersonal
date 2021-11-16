package cWH;

import java.util.ArrayList;
import java.util.Date;

import static java.lang.System.*;

public class PracticeSet15 {
    public static void main(String[] args) {
        //Problem 1
        ArrayList ar = new ArrayList();
        for(int i=1;i<=10;i++){
            ar.add("Student "+i);
        }
        for(Object e: ar){out.println(e);}

        //Problem 2
        Date d= new Date();
        out.printf("%d:%d:%d\n",d.getHours(),d.getMinutes(),d.getSeconds());

        //Problem 3

    }
}
