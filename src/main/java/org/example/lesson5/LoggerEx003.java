package org.example.lesson5;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LoggerEx003 {

    private static final Logger logger = LoggerFactory.getLogger(LoggerEx003.class);

    public static void main(String[] args) {

        logger.info("Hello, program was started!");


        try{
            int a = 2 / 0;
        }catch (Exception e){
            logger.error("Error: " + e.getMessage(), e);
        }


        logger.info("Hello, program successfully done!");

    }


}
