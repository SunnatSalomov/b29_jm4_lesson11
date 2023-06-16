package com.company.tasks;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Task5 {
    static List<String> holidays = new ArrayList<>();
    static {
        holidays.add("01.01");
        holidays.add("08.03");
        holidays.add("21.03");
        holidays.add("09.05");
        holidays.add("31.08");
        holidays.add("01.09");
        holidays.add("01.10");
        holidays.add("08.12");
        holidays.add("31.12");
    }
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        int year =2019;
        int workDays=0;
        calendar.set(year, 0, 1);
        while (calendar.get(Calendar.YEAR)==year){
            int day = calendar.get(Calendar.DAY_OF_WEEK);
            if (day!=1 && day!=7 && !isHoliday(calendar)){
                workDays++;
            }
            calendar.add(Calendar.DAY_OF_WEEK,1);

        }
        System.out.println(workDays);
    }

    private static boolean isHoliday(Calendar calendar) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM");
        String formatted = simpleDateFormat.format(calendar.getTime());
        return holidays.contains(formatted);
    }
}
