package cWH;

import java.time.*;

public class TimeAPI {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2005,8,15);
        System.out.println(ld.getDayOfWeek());
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
    }
}
