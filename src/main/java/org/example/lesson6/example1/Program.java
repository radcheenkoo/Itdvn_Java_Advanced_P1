package org.example.lesson6.example1;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Program {

    public static void main(String[] args) {
        Person tom = new Person("Tom", "Rich", 22);
        log.info(tom.toString());

        Person bob = tom.clone();
        bob.setFirstname("Bob");

        log.info(bob.toString());
        log.info(tom.toString());


    }

}
