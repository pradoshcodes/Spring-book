package com.books.springbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    private BookService bookservice;

    @GetMapping("/book")
    public List<Book> getbook() {
        return bookservice.getAll();

    }
    @GetMapping("/book/{id}")
   public Book getbook(@PathVariable("id") int id){
    return bookservice.getbyid(id);
   }

   @PostMapping("/book")
   public Book getBook(@RequestBody Book book){
    Book b =this.bookservice.addbook(book);
    return b;
   }

}
