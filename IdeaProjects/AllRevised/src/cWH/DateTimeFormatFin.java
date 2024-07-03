package cWH;
import java.time.format.*;

import java.time.*;

public class DateTimeFormatFin {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        DateTimeFormatter df1 = DateTimeFormatter.ofPattern("yyyy MM dd hh mm ss");
        String myDate=ldt.format(df1);
        System.out.println(myDate);
    }
}
