package com.company.service2;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class   App3 {
    public static void main(String[] args) {
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.MIDNIGHT);
        System.out.println(LocalTime.NOON);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalTime localTime1 = LocalTime.of(11, 48);
        System.out.println(localTime1);

        System.out.println();
        System.out.println(ZoneId.systemDefault());
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        for (String availableZoneId : availableZoneIds) {
//            LocalTime now = LocalTime.now(ZoneId.of(availableZoneId));
//            LocalDateTime now = LocalDateTime.now(ZoneId.of(availableZoneId));
            ZonedDateTime now = ZonedDateTime.now(ZoneId.of(availableZoneId));
            System.out.println(availableZoneId+ " :: "+now);
        }
        System.out.println("availableZoneIds.size() = " + availableZoneIds.size());
    }
}
