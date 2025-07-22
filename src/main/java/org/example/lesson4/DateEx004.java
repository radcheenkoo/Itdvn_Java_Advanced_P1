package org.example.lesson4;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;


public class DateEx004 {

    public static void main(String[] args) {

        DateTime currentDate = new DateTime(DateTimeZone.UTC);
        System.out.println("Current date: " + currentDate);

        DateTime customDate =  new DateTime("2026-07-22T9:37:0");
        System.out.println("Custom date: " + customDate);


        // Formatter
        DateTimeFormatter dtf = DateTimeFormat.forPattern("d MMMM, yyyy");
        System.out.println(currentDate.toString(dtf));

        // Duration
        Duration duration = new Duration(currentDate, customDate);
        System.out.println(duration.toStandardDays().getDays());

        // first and last day of month

        int year = 2025;
        int month = 2;

        DateTime firstDayOfMonth = new DateTime(year, month, 1, 0, 0, 0).dayOfMonth().withMinimumValue();
        DateTime lastDayOfMonth = new DateTime(year, month, 1, 0, 0, 0).dayOfMonth().withMaximumValue();

        System.out.println("First day of month: " + firstDayOfMonth + "\nLast day of month: " + lastDayOfMonth);


        // is weekend
        DateTime dateTime = new DateTime();

        System.out.println("Is weekend today: " + isWeekend(dateTime));

    }

    private static boolean isWeekend(DateTime dateTime){
        return dateTime.getDayOfWeek() == 6 || dateTime.getDayOfWeek() == 7;
    }
}
