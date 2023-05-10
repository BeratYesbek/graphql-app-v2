package com.beratyesbek.modular.graphql.app.api.convertors;

import com.beratyesbek.modular.graphql.app.api.dom.author.AuthorCreateRequest;
import com.beratyesbek.modular.graphql.app.api.dom.author.AuthorReadRequest;
import com.beratyesbek.modular.graphql.app.database.entities.Author;

public final class AuthorConvertor {

    private AuthorConvertor() {

    }

    public static Author convertAuthorCreateRequestToAuthor(AuthorCreateRequest request) {
        return Author.builder()
                .age(request.getAge())
                .name(request.getName())
                .reputation(request.getReputation())
                .build();
    }

    public static AuthorReadRequest convertAuthorToAuthorReadRequest(Author author) {
        return AuthorReadRequest.builder()
                .name(author.getName())
                .age(author.getAge())
                .reputation(author.getReputation())
                .id(author.getId())
                .createdAt(author.getCreatedAt())
                .build();
    }

}
