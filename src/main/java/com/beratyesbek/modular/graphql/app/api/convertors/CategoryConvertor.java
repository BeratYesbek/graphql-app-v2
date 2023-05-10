package com.beratyesbek.modular.graphql.app.api.convertors;

import com.beratyesbek.modular.graphql.app.api.dom.category.CategoryCreateRequest;
import com.beratyesbek.modular.graphql.app.api.dom.category.CategoryReadRequest;
import com.beratyesbek.modular.graphql.app.database.entities.Category;

public final class CategoryConvertor {

    private CategoryConvertor() {

    }

    public static CategoryReadRequest convertCategoryToCategoryReadRequest(Category category) {
        return CategoryReadRequest.builder()
                .name(category.getName())
                .id(category.getId())
                .createdAt(category.getCreatedAt()).build();
    }

    public static Category convertCategoryCreateRequestToCategory(CategoryCreateRequest category) {
        return Category.builder()
                .name(category.getName()).build();

    }
}
