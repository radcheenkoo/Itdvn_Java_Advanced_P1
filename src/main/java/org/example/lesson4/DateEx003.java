package org.example.lesson4;

import java.time.LocalDateTime;

public class DateEx003 {

    public static void main(String[] args) {

        LocalDateTime currentDate = LocalDateTime.now();
        System.out.println("Current date and time: " + currentDate);

        LocalDateTime customDate = LocalDateTime.of(3025, 7, 22, 10, 9, 0);

        System.out.println("Custom date: " + customDate);

        System.out.println("Custom date is before current: " + customDate.isBefore(currentDate));
        System.out.println("Custom date is after current: " + customDate.isAfter(currentDate));


        System.out.println("Get years: " + currentDate.getYear());
        System.out.println("Get months: " + currentDate.getMonth());
        System.out.println("Get day of week: " + currentDate.getDayOfWeek());
        System.out.println("Get day of month: " + currentDate.getDayOfMonth());
        System.out.println("Get day of year: " + currentDate.getDayOfYear());


        System.out.println("Plus 3 days: " + currentDate.plusDays(3));
        System.out.println("Plus 2 weeks: " + currentDate.plusWeeks(2));
        System.out.println("Plus 1 month: " + currentDate.plusMonths(1));
        System.out.println("Plus 5 years: " + currentDate.plusYears(5));

        System.out.println("Minus 3 days: " + currentDate.minusDays(3));
        System.out.println("Minus 2 weeks: " + currentDate.minusWeeks(2));
        System.out.println("Minus 1 month: " + currentDate.minusMonths(1));
        System.out.println("Minus 5 years: " + currentDate.minusYears(5));

    }

}
