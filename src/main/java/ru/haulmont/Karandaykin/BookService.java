package ru.haulmont.Karandaykin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookList bookList;

    public List<Book> getAll(){
        return (List<Book>) bookList.findAll(Sort.by(Sort.Order.asc("bookName"), Sort.Order.asc("publishYear")));
    }

    public Book save(Book book) {
        return bookList.save(book);
    }
}
