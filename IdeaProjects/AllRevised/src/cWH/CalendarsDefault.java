package cWH;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

import static java.util.Calendar.DAY_OF_WEEK;

public class CalendarsDefault {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        //We create an instance for abstract classes which have this
        //static usable methods
        System.out.println(c.getCalendarType());
        System.out.println(c.getTime());
        System.out.println("\n");
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.MINUTE));
        for (int i : new int[]{Calendar.HOUR, Calendar.DATE, Calendar.YEAR}) {
            System.out.println(c.get(i));
        }
        System.out.println(c.getTimeZone());

        Calendar c2 = Calendar.getInstance(TimeZone.getTimeZone("IST"));
        System.out.println(c2.getTimeZone().getID());
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt(), day = scanner.nextInt(), year=scanner.nextInt();
        LocalDate dt = LocalDate.of(year,month,day);
        System.out.println(dt.getDayOfWeek()); //returns object type
    }
}
