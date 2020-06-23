package com.tej.JooQDemo;

import com.tej.JooQDemo.jooq.sample.model.tables.pojos.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping
    public List<Book> getBooks(){
        return this.bookService.getBooks();
    }

    @PostMapping
    public void postBook(@RequestBody Book book){
        this.bookService.insertBook(book);
    }
}
