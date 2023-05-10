package com.beratyesbek.modular.graphql.app.api.controller;

import com.beratyesbek.modular.graphql.app.api.convertors.BookConvertor;
import com.beratyesbek.modular.graphql.app.api.dom.book.BookCreateRequest;
import com.beratyesbek.modular.graphql.app.api.dom.book.BookReadRequest;
import com.beratyesbek.modular.graphql.app.database.entities.Book;
import com.beratyesbek.modular.graphql.app.services.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @MutationMapping
    public BookReadRequest createBook(@Argument BookCreateRequest book) {
        Book createdBook = BookConvertor.convertBookCreateRequestToBook(book);
        return BookConvertor.convertBookToBookReadRequest(bookService.create(createdBook));
    }

    @QueryMapping
    public BookReadRequest findBookById (@Argument int id) {
        Book book = bookService.findById(id);
        return BookConvertor.convertBookToBookReadRequest(book);
    }
}
