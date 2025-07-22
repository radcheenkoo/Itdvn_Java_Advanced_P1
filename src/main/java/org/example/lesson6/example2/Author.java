package org.example.lesson6.example2;


import lombok.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Author implements Cloneable{

    private String name;
    private String lastName;

    @Override
    public Author clone() {
        try {
            Author clone = (Author) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
