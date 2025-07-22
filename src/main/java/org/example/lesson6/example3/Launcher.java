package org.example.lesson6.example3;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Launcher {

    public static void main(String[] args) {


        Car bmw = new Car("BMW", new Engine("V8"));
        Car audi = bmw.clone();

        log.info("car 1: " + bmw.toString());
        log.info("car 2: " + audi.toString());

        Car mersedes = audi.createClone("Mersedes", new Engine("V12"));

        log.info("car 3: " + mersedes.toString());


    }

}
