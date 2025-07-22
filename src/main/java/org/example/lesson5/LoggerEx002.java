package org.example.lesson5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LoggerEx002 {

    private static final Logger logger = LoggerFactory.getLogger(LoggerEx002.class);

    public static void main(String[] args) {

        logger.trace("Trace message!");
        logger.debug("Debug message!");
        logger.info("Info message!");
        logger.warn("Warn message!");
        logger.error("Error message!");


    }
}
