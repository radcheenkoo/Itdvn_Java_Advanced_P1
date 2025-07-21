package org.example.lesson3;

public class StringDemo {

    public static void main(String[] args) {

        String str = "Hello world!";
        String empty = "";
        String badStr = "      Sfdasefd 4234 sdcas 3    3423 43243 432wefs      ";

        // length() - method in String returns number of letters in word as int.
        System.out.println(str.length());


        // toCharArray() - method in String that returns array of characters as returned value.
        for (char symbol: str.toCharArray()) {
            System.out.print(symbol  + " ");
        }
        System.out.println();


        // isEmpty() - method in String returns boolean value, if string is empty returns true, else returns false.
        System.out.println("Value: " + str + " is empty: " + str.isEmpty());
        System.out.println("Value: " + empty + "is empty: " + empty.isEmpty());


        // concat() - method in String allows to join to the string, another string, without operator +
        System.out.println(str.concat(" Hello Java!"));


        // join() - method in String.
        System.out.println(String.join(str, "1", "2", "3"));


        // chatAt() - method in String that returns the symbol by index.
        System.out.println(str.charAt(4));


        // indexOf() - method in String that returns the index by symbol.
        System.out.println(str.indexOf('d'));

        // lastIndexOf() - method in String that returns the last index of symbol.
        System.out.println(str.lastIndexOf('l'));


        // startsWith() - method in String that returns boolean value as result, if string start with the word returns true, else false
        System.out.println("Value: "+ str + " is start with 'Hello': " + str.startsWith("Hello"));
        System.out.println("Value: "+ str + " is start with 'World': " + str.startsWith("World"));

        System.out.println();

        // endsWith() - method in String that returns boolean value as result, if string ends with the word returns true, else false
        System.out.println("Value: "+ str + " is start with 'World': " + str.endsWith("World"));
        System.out.println("Value: "+ str + " is start with 'Hello': " + str.endsWith("Hello"));


        // replace() - method in String that first parameter lets replace all characters in the word by new character that goes as second parameter
        System.out.println(str.replace('l', 'k'));

        System.out.println();

        // trim() - method in String that delete all spaces at the start and end string
        System.out.println(badStr);
        System.out.println(badStr.trim());

        System.out.println();


        // substring() - a method in String that cuts characters from a string to the value passed in the parameters
        System.out.println(str.substring(6));
        System.out.println(str.substring(3, 6));

        System.out.println();


        // toLowerCase(), toUpperCase() - a methods that returns string as Lower or Upper case.
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());


        System.out.println();


        // split() - a method in a String that divides a string into an array of strings by the element that is passed as a parameter

        String[] strArray = str.split(" ");

        for (String s : strArray) {
            System.out.println(s);
        }
    }
}
