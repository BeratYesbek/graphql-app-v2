package com.beratyesbek.modular.graphql.app.database.dao;


import com.beratyesbek.modular.graphql.app.api.dom.filters.BookFilterRequest;
import com.beratyesbek.modular.graphql.app.database.entities.Book;

import java.util.List;

public interface CustomBookDao {
    List<Book> findByCriteria(BookFilterRequest bookFilterRequest);
}
