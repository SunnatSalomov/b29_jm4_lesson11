package com.company.service2;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class App4 {
    public static void main(String[] args) {
        Period period = Period.between(
                LocalDate.of(2004, 3, 7),
                LocalDate.now()
        );
        System.out.println(period);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

        // 7,031 days

        long days = ChronoUnit.DAYS.between(
                LocalDate.of(2004, 3, 7),
                LocalDate.now()
        );
        System.out.println("days = " + days);
    }

}
