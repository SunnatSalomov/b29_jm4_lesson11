package com.company.tasks;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int counter = 0;

        while (counter < 20) {
            int day = calendar.get(Calendar.DAY_OF_WEEK);

            if (day != 1 && day != 7) {
                counter++;

            }
            calendar.add(Calendar.DAY_OF_WEEK, 1);
        }

        System.out.println(calendar.getTime());

    }
}
