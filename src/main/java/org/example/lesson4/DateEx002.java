package org.example.lesson4;

import java.util.Date;

public class DateEx002 {

    public static void main(String[] args) throws InterruptedException {
        Date date = new Date();

        Thread.sleep(1000);

        Date newDate = new Date();

        System.out.println(date);
        System.out.println(newDate);

        System.out.println("Time difference: " + (newDate.getTime() - date.getTime()) + " ms");


        // Comparing dates

        System.out.println("Date is before newDate: " + date.before(newDate));
        System.out.println("newDate is before Date: " + newDate.after(date));

        System.out.println("date equals newDate: " + date.equals(newDate));


        // Deprecate methods

        System.out.println("Deprecated method works! Get hours: " + date.getHours());

    }

}
