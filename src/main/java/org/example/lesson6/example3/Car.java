package org.example.lesson6.example3;


import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString

public class Car implements Cloneable{

    private final String name;
    private final Engine engine;

    public Car createClone(String name, Engine engine){
        return new Car(name, engine);
    }


    @Override
    public Car clone() {
        try {
            Car clone = (Car) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
