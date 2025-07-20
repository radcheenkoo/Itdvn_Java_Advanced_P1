package org.example.lesson1;

import java.util.Scanner;

public class Main {

    /*
    * Some program for build jar file and run jar on PC in terminal
    * */


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String name = "";
        String colour = "";
        int age = 0;

        System.out.println("Give the name for your cat!\n");
        name = scanner.nextLine();

        System.out.println("How old is your cat?");
        age = scanner.nextInt();

        System.out.println("What colour is your cat?");
        colour = scanner.nextLine();

        System.out.println();
        System.out.println("So, info about your cat: ");

        Main main = new Main();

        Cat cat = main.createCat(name, colour, age);

        System.out.println(cat.toString());

        name = "Vasya";
        colour = "black";
        age = 4;

        System.out.println(main.updateCat(name, colour, age, cat).toString());

    }

    public Cat createCat(String name, String colour, int age){
        return new Cat(name, colour, age);
    }

    public Cat updateCat(String name, String colour, int age, Cat cat){

        cat.setName(name);
        cat.setColour(colour);
        cat.setAge(age);

        return cat;
    }

}