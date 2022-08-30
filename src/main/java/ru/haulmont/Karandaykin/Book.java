package ru.haulmont.Karandaykin;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "bookName", nullable = false)
    private String bookName;

    @Column(name = "publishYear", nullable = false)
    private int publishYear;

    @Column(name = "publisher", nullable = false)
    private String publisher;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public String getPublisher() {
        return publisher;
    }

    protected Book(){}

    public Book(String bookName, int publishYear, String publisher) {
        this.bookName = bookName;
        this.publishYear = publishYear;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return String.format(
                "Book[id=%d, bookName='%s', publishYear=%d publisher='%s']",
                id, bookName, publishYear, publisher);
    }
}