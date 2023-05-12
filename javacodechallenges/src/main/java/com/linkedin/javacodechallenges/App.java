package com.linkedin.javacodechallenges;

import java.time.LocalDate;
import java.time.ZoneId;

public class App {
    // Create function to calculate the date that's 
    // 100 days from now

    public static void main(String[] args) {
        System.out.println("100 days from now is... " + getDate100DaysFromToday());
    }

    public static LocalDate getDate100DaysFromToday() {
        LocalDate today = LocalDate.now(ZoneId.of("Europe/Paris"));
        return today.plusDays(100);
    }
}
