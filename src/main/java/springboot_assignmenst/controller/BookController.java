package springboot_assignmenst.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot_assignmenst.model.Book;
import springboot_assignmenst.model.BookListWrapper;


import java.util.Arrays;

@RestController
public class BookController {

    @GetMapping(value = "/books", produces = "application/xml")
    public BookListWrapper getBooks() {
        return new BookListWrapper(Arrays.asList(
            new Book(101, "Java Programming", "James Gosling"),
            new Book(102, "Spring Boot", "Pivotal"),
            new Book(103, "Hibernate", "Gavin King")
        ));
    }
}
