package cWH;

import java.time.*;

import static java.lang.System.*;

public class TimeAPI {
    public static void main(String[] args) {
//        LocalDate ld = LocalDate.of(2005,8,15);
//        out.println(ld.getDayOfWeek());
//        out.println(LocalDate.now());
//        out.println(LocalTime.now());
//        out.println(LocalDateTime.now());

        Instant i = Instant.now();
        out.println(i);
    }
}
