package com.beratyesbek.modular.graphql.app.api.dom.author;

import com.beratyesbek.modular.graphql.app.database.entities.enums.Reputation;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class AuthorReadRequest {
    private int id;
    private int age;
    private String name;
    private Reputation reputation;
    private LocalDate createdAt;
}
