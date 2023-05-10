package com.beratyesbek.modular.graphql.app.services;


import com.beratyesbek.modular.graphql.app.database.entities.Book;

public interface BookService {
    Book create(Book book);
    Book findById(int id);
}
