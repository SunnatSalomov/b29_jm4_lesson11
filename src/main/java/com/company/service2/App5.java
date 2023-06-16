package com.company.service2;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class App5 {
    public static void main(String[] args) {
        Duration duration = Duration.between(
                LocalDateTime.of(2004, 3, 7, 0, 0),
                LocalDateTime.now()
        );
        System.out.println(duration);
    }
}
