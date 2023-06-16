package com.company.tasks;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int year = new Scanner(System.in).nextInt();
        Calendar calendar =Calendar.getInstance();

        calendar.set(year,0,1);
        int days = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
        System.out.println(days==366);

        System.out.println("************");

        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        System.out.println(gregorianCalendar.isLeapYear(year));

        System.out.println();


    }
}
