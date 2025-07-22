package org.example.lesson6.example2;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProgramEx001 {

    public static void main(String[] args) {

        Author author = new Author("Carlos", "Castaneda");
        Book book1 = new Book("Don Huan", author);


      log.info("Book 1: " + book1.toString());


      Book book2 = book1.clone();
      book2.setName("The Thousand faces hero");
      book2.setAuthor(new Author("Karl", "Yung"));

      log.info("Book 2: " + book2.toString());
      log.info("Book 1: " + book1.toString());


    }

}
