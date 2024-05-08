package com.books.springbook;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class BookService {

    private static List<Book> list = new ArrayList<>();

    static {
        list.add(new Book(12, "Java: The Complete Reference", "Bruce Eckel"));
        list.add(new Book(39, "The C Programming Language", "Dennis Ritchie"));
        list.add(new Book(43, "The C Programming Language (Second Edition)", "Levine"));
        list.add(new Book(23, "Spring Framework Documentation", "Sam Brannen"));
        list.add(new Book(07, "Java Concurrency in Practice", "Brian Goetz"));
    }

    public List<Book> getAll() {
        return list;
    }

    public Book getbyid(int id) {
        for (Book book : list) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    public Book addbook(Book b) {
        list.add(b);
        return b;
        }
}
