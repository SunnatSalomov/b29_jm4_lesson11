package com.company.tasks2;

import java.time.LocalDate;

public class Task8 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();

        System.out.println("Oyning tartib raqami : "+localDate.getMonthValue());
        System.out.println("Oyning davomiyligi : "+localDate.lengthOfMonth());
        System.out.println("Oyning maxsimum davomiyligi : "+localDate.getMonth().maxLength());
        System.out.println("Kvartalning birinchi oyi : "+localDate.getMonth().firstMonthOfQuarter());
        System.out.println("Oyning nomi : "+localDate.getMonth());
    }
}
