package com.beratyesbek.modular.graphql.app.database.dao;

import com.beratyesbek.modular.graphql.app.database.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryDao extends JpaRepository<Category, Integer> {
}
