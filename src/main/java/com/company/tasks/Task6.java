package com.company.tasks;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task6 {
    public static void main(String[] args) {
        test10();
    }

    private static void test10() {
        // November 4, 2003 8:14:11 PM EST
//        DateFormat sdf = new SimpleDateFormat("MMMM d, yyyy h:m:s a z");
        DateFormat sdf = new SimpleDateFormat("'Oy: 'MMMM 'kun: 'd, 'yil: 'yyyy \n h:m:s a z");
        System.out.println(sdf.format(new Date()));
    }

    private static void dateDemo() {
        //        Date date = new Date(2004, 2, 7);
//        Date date = new Date(104, 2, 7);
        Date date = new Date();
        System.out.println(date);

        System.out.println(date.getTime());

        date.setTime(2000);
        System.out.println(date);

        System.out.println();

        Date date1 = new Date(new Date().getTime() + 30 * 60 * 1000);
        System.out.println("date1 = " + date1);

        Date date2 = new Date(new Date().getTime() + 45 * 60 * 1000);
        System.out.println("date2 = " + date2);

        System.out.println(date2.before(date1));
        System.out.println(date2.after(date1));
        System.out.println(date2.equals(date1));
    }
}
