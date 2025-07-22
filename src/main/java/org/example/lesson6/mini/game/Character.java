package org.example.lesson6.mini.game;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
class Character implements Cloneable {
    private String name;
    private int life;

    public void reduceLives(int amount) {
        life -= amount;
    }

    @Override
    public Character clone() throws CloneNotSupportedException {
        return (Character) super.clone();
    }
}