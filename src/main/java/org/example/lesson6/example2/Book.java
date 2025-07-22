package org.example.lesson6.example2;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Book implements Cloneable {

    private String name;
    private Author author;

    @Override
    public Book clone() {
        try {
            Book clone = (Book) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
