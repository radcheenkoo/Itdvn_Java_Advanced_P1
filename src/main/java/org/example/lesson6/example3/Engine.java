package org.example.lesson6.example3;

import lombok.*;


@AllArgsConstructor
@ToString
@Getter
@Setter
public class Engine implements Cloneable {

    private String name;

    @Override
    public Engine clone() {
        try {
            Engine clone = (Engine) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
