package springboot_assignmenst.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import springboot_assignmenst.model.Book12;
import springboot_assignmenst.repository.BookRepository;

import java.util.List;

@RestController
@RequestMapping("/book12")
public class BookRestController {

    @Autowired
    private BookRepository bookRepo;

    @GetMapping("/all")
    public List<Book12> getAllBooks() {
        return bookRepo.getAllBooks();
    }

    @PostMapping("/add")
    public String addBook(@RequestBody Book12 book) {
        bookRepo.addBook(book);
        return "Book added successfully!";
    }
}
