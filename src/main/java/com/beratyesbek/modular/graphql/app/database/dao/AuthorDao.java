package com.beratyesbek.modular.graphql.app.database.dao;

import com.beratyesbek.modular.graphql.app.database.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorDao extends JpaRepository<Author, Integer> {
}
