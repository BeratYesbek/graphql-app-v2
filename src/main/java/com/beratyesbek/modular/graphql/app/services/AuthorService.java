package com.beratyesbek.modular.graphql.app.services;


import com.beratyesbek.modular.graphql.app.database.entities.Author;

public interface AuthorService {

    Author create(Author author);

    Author findById(int id);
}
