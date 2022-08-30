package ru.haulmont.Karandaykin;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @Column(name = "ID", nullable = false)
    private UUID id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "publishYear", nullable = false)
    private int publishYear;

    @Column(name = "publisher", nullable = false)
    private String publisher;

    public UUID getId() {
        return id;
    }

    public Book setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getBookName() {
        return name;
    }

    public Book setBookName(String name) {
        this.name = name;
        return this;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public Book setPublishYear(int publishYear) {
        this.publishYear = publishYear;
        return this;
    }

    public String getPublisher() {
        return publisher;
    }

    public Book setPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    @Override
    public String toString() {
        return String.format(
                "Book[id=%d, bookName='%s', publishYear=%d publisher='%s']",
                id, name, publishYear, publisher);
    }
}