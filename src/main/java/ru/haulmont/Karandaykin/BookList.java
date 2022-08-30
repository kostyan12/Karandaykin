package ru.haulmont.Karandaykin;

import org.springframework.data.jpa.repository.JpaRepository;


public interface BookList extends JpaRepository<Book, Long> {

}
