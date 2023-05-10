package com.beratyesbek.modular.graphql.app.api.dom.author;

import com.beratyesbek.modular.graphql.app.database.entities.enums.Reputation;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class AuthorCreateRequest {
    private String name;
    private int age;
    private Reputation reputation;
}
