package com.tej.JooQDemo;

import com.tej.JooQDemo.jooq.sample.model.Tables;
import com.tej.JooQDemo.jooq.sample.model.tables.pojos.Book;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookService {

    @Autowired
    DSLContext context;

    public List<Book> getBooks(){
       return context
                .selectFrom(Tables.BOOK)
                .fetchInto(Book.class);
    }

    public void insertBook(Book book){
        context
                .insertInto(Tables.BOOK, Tables.BOOK.TITLE, Tables.BOOK.AUTHOR)
                .values(book.getTitle(), book.getAuthor())
                .execute();
    }
}
