package org.example.lesson3;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            stringBuilder.append(i);
        }

        System.out.println(stringBuilder);

        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder.insert(0, "Hello "));

        System.out.println("Hello \" world \" \n sdasd \t dima \' ' ");

    }


}
