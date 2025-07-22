package org.example.lesson4;

import java.util.Date;

public class DateEx001 {

    public static void main(String[] args) {

        String str = "22 липня 2025 року";
        System.out.println(str);

        Date date = new Date();
        Date concreateDate = new Date(34234242222542L);

        System.out.println(date);
        System.out.println(concreateDate);

    }

}
