package com.example.demoweb.books;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class BookController {

    @GetMapping("/book/{id}")
    public Book getABook(@PathVariable Long id){
        Book book  = new Book();
        book.setId(id);
        book.setAuthor("Jukyung Yoo");
        book.setTitle("Spring Boot");
        book.setPublishedAt(new Date());
        return book;
    }
}
