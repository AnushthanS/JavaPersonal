package cWH;

import java.time.format.DateTimeFormatter;
import java.util.*;
import java.time.*;

import static java.lang.System.*;

public class PracticeSet15 {
    public static void main(String[] args) {
        //Problem 1
//        ArrayList ar = new ArrayList();
//        for(int i=1;i<=10;i++){
//            ar.add("Student "+i);
//        }
//        for(Object e: ar){out.println(e);}
//
//        //Problem 2
//        Date d= new Date();
//        out.printf("%d:%d:%d\n",d.getHours(),d.getMinutes(),d.getSeconds());

        //Problem 3
//        Calendar c = Calendar.getInstance();
//        out.printf("%d:%d:%d\n",c.get(Calendar.HOUR_OF_DAY),c.get(Calendar.MINUTE),c.get(Calendar.SECOND));

        //Problem 4
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter df1 = DateTimeFormatter.ofPattern("HH:mm:ss"); //correct for this question
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_TIME;
        out.println(ldt.format(df1)+"\n"+ldt.format(df2));

        //Problem 5
//        HashSet<Integer> hs = new HashSet<>();
//        hs.add(10);
//        hs.add(10);
//        hs.add(9);
//        hs.add(8);
//        hs.add(100);
//        out.println(hs);
    }
}
