package org.example.lesson3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

    public static void main(String[] args) {

        String str = "Hello Java, Hello JavaScript, Hello JavaSE w343";
        Pattern pattern = Pattern.compile("Java\\w*");
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()){
            System.out.println(matcher.group());
        }

        System.out.println(str.replaceAll("Java\\w*", "Spring"));

    }

}
