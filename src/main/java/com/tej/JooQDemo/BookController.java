package com.tej.JooQDemo;

import com.tej.JooQDemo.jooq.sample.model.tables.pojos.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping
    public List<Books> getBooks(){
        return this.bookService.getBooks();
    }
}
