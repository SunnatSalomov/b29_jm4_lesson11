package com.company.service2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class App2 {
    public static void main(String[] args) {
        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate localDate1 = LocalDate.of(2023, 6, 7);
        System.out.println(localDate1);

//        LocalDate localDate2 = LocalDate.parse("2023-06-07");
        LocalDate localDate2 = LocalDate.parse("07.06.2023",
                DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        System.out.println(localDate2);

        System.out.println(
                localDate2.format(DateTimeFormatter.ofPattern("d/M/y")));

        LocalDate localDate3 = LocalDate.ofEpochDay(50_000);
        System.out.println(localDate3);

        LocalDate localDate4 = LocalDate.ofYearDay(2023, 300);
        System.out.println(localDate4);

        System.out.println();
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfYear());

        // Month, DayOfWeek
        System.out.println();
        System.out.println(localDate.isLeapYear());

        System.out.println();

        LocalDate localDate5 = localDate
                .plusYears(5)
                .plusMonths(-2)
                .minusWeeks(2);
        System.out.println(localDate5);

        System.out.println();
        System.out.println(localDate.lengthOfMonth());

        System.out.println();
        LocalDate localDate6 = localDate.with(ChronoField.YEAR, 1990);
        System.out.println(localDate6);

        System.out.println();
        System.out.println("localDate = " + localDate);

        LocalDate nextSunday = localDate.with(
                TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));
//                TemporalAdjusters.next(DayOfWeek.SUNDAY));
//                TemporalAdjusters.previous(DayOfWeek.SUNDAY));
//                TemporalAdjusters.previousOrSame(DayOfWeek.SUNDAY));


        System.out.println("nextSunday = " + nextSunday);

        LocalDate localDate7 = localDate.with(
                TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY)
//                TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY)
        );
        System.out.println("localDate7 = " + localDate7);
    }
}
