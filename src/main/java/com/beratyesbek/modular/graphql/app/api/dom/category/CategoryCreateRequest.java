package com.beratyesbek.modular.graphql.app.api.dom.category;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CategoryCreateRequest {

    private String name;
}
