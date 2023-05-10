package com.beratyesbek.modular.graphql.app.api.dom.category;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class CategoryReadRequest {
    private int id;
    private String name;
    private LocalDate createdAt;
}
