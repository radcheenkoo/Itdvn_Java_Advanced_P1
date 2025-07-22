package org.example.lesson5;

import java.util.logging.Logger;

public class LoggerEx001 {

    private static final Logger logger = Logger.getLogger(LoggerEx001.class.getName());

    public static void main(String[] args) {
        logger.info("Hello world!");

        System.out.println("This is simple logging!");
        System.err.println("This is simple logging!");
    }


}
