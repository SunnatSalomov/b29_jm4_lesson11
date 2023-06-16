package com.company.tasks;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int year = new Scanner(System.in).nextInt();
        test1(year);
        test2(year);


    }

    private static void test2(int year) {
        LocalDate localDate = LocalDate.of(year, 1, 1);
        localDate = localDate.with(
                TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY))
                .plusWeeks(9);
        System.out.println(localDate);
    }

    private static void test1(int year) {
        Calendar calendar = Calendar.getInstance();

        calendar.set(year, Calendar.JANUARY, 1);

        while (calendar.get(Calendar.DAY_OF_WEEK) != Calendar.FRIDAY) {
            calendar.add(Calendar.DAY_OF_WEEK, 1);
        }

        calendar.add(Calendar.WEEK_OF_YEAR, 9);
        System.out.println(calendar.getTime());
    }
}
