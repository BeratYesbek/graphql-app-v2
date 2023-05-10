package com.beratyesbek.modular.graphql.app.database.dao;

import com.beratyesbek.modular.graphql.app.database.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDao extends JpaRepository<Book, Integer>, CustomBookDao {
}
