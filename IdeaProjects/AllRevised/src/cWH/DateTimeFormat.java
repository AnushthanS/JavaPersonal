package cWH;

import java.time.*;
import java.time.format.*;

public class DateTimeFormat {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
        LocalDate date = LocalDate.now();
        String text = date.format(formatter);
        LocalDate parsedDate = LocalDate.parse(text,formatter);
        System.out.println(parsedDate);
    }
}

