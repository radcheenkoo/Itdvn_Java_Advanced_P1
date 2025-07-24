package org.example.lesson8;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Animal implements Eating{

    public static String CATEGORY = "domestic";
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract String getSound();
}
