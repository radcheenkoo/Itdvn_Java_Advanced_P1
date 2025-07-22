package org.example.lesson6.example1;

import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Person implements Cloneable {

    private String firstname;
    private String lastname;
    private int age;


    @Override
    public Person clone() {
        try {
            Person clone = (Person) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
