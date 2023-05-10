package com.beratyesbek.modular.graphql.app.services;

import com.beratyesbek.modular.graphql.app.database.dao.CategoryDao;
import com.beratyesbek.modular.graphql.app.database.entities.Category;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService{

    private final CategoryDao categoryDao;

    public CategoryServiceImpl(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    @Override
    public Category create(Category category) {
        return categoryDao.save(category);
    }
}
