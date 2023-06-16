package com.company.service;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.HOUR));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));
        System.out.println(calendar.get(Calendar.MILLISECOND));

        Date date = calendar.getTime();
        System.out.println(date.toString());

        System.out.println();

        calendar.set(2004, Calendar.MARCH, 7);
        System.out.println(calendar.getTime());

        calendar.add(Calendar.DAY_OF_MONTH, 10000);
        System.out.println(calendar.getTime());

        calendar.add(Calendar.MONTH, -5);
        System.out.println(calendar.getTime());

        System.out.println(calendar.getMaximum(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));

        System.out.println();


        for (int i = 0; i < 12; i++) {
            calendar.set(2023, i, 1);
            System.out.println(calendar.getTime());

            int month = i + 1;
            int days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
            System.out.println(month+ " :: "+days);
            System.out.println();
        }


    }
}
