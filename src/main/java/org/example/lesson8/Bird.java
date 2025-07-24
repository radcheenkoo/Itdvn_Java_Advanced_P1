package org.example.lesson8;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Bird extends Animal{

    private boolean walks;

    public Bird(String name, boolean walks) {
        super(name);
        this.walks = walks;
    }

    public Bird() {
        super("Bird");
    }

    public Bird(String name) {
        super(name);
    }

    @Override
    public String getSound() {
        return "bird's sound";
    }


    @Override
    public String eat() {
        return "grain";
    }

    public boolean isWalks() {
        return walks;
    }

    private String getPrivate(){
        return "private";
    }
}
