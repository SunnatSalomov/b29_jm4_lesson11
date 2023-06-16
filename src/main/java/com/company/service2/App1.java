package com.company.service2;

import java.time.Instant;
import java.time.temporal.ChronoField;

public class App1 {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);
        /*System.out.println(instant.get(ChronoField.YEAR));
        System.out.println(instant.get(ChronoField.MONTH_OF_YEAR));
        System.out.println(instant.get(ChronoField.DAY_OF_YEAR));
        System.out.println(instant.get(ChronoField.DAY_OF_WEEK));
        System.out.println(instant.get(ChronoField.DAY_OF_MONTH));
        System.out.println(instant.get(ChronoField.HOUR_OF_DAY));*/

        System.out.println(instant.isSupported(ChronoField.DAY_OF_YEAR));
        System.out.println(instant.isSupported(ChronoField.MILLI_OF_SECOND));
    }
}
