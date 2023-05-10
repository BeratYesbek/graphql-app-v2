package com.beratyesbek.modular.graphql.app.api.controller;

import com.beratyesbek.modular.graphql.app.api.convertors.CategoryConvertor;
import com.beratyesbek.modular.graphql.app.api.dom.category.CategoryCreateRequest;
import com.beratyesbek.modular.graphql.app.api.dom.category.CategoryReadRequest;
import com.beratyesbek.modular.graphql.app.database.entities.Category;
import com.beratyesbek.modular.graphql.app.services.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

@Controller
@Slf4j
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @MutationMapping
    public CategoryReadRequest createCategory(@Argument CategoryCreateRequest category) {
       Category createdCategory =
               categoryService.create(CategoryConvertor.convertCategoryCreateRequestToCategory(category));
       return CategoryConvertor.convertCategoryToCategoryReadRequest(createdCategory);
    }
}
