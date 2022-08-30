package ru.haulmont.Karandaykin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Book>> getAll() {
        List<Book> bookList = bookService.getAll();
        return new ResponseEntity<>(bookList, HttpStatus.OK);
    }

    @GetMapping("/create")
    public ResponseEntity<Book> addBook(@RequestParam String name, @RequestParam String manufacturer, @RequestParam int year) {
        Book book = new Book()
                .setBookName(name)
                .setPublishYear(year)
                .setPublisher(manufacturer);
        bookService.save(book);
        return new ResponseEntity<>(book, HttpStatus.OK);
    }
}
