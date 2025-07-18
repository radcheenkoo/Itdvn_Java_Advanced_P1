package org.example.lesson1;

import java.util.Scanner;

public class Main {

    /*
    * Some program for build jar file and run jar on PC in terminal
    * */


    public static void main(String[] args) {

        Cat milka = new Cat();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the name for your cat!\n");
        milka.setName(scanner.nextLine());

        System.out.println("How old is your cat?");
        milka.setAge(scanner.nextInt());

        System.out.println("What colour is your cat?");
        milka.setColour(scanner.nextLine());

        System.out.println();
        System.out.println("So, info about your cat: ");
        milka.setColour(scanner.nextLine());

        System.out.println(milka);


    }
}