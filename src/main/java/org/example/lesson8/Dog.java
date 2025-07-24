package org.example.lesson8;

public class Dog extends Animal implements Moving{


    public Dog(String name) {
        super(name);
    }

    @Override
    public String getSound() {
        return "woff";
    }



    @Override
    public String move() {
        return "walks";
    }

    @Override
    public String eat() {
        return "bones";
    }
}
