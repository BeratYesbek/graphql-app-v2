package com.beratyesbek.modular.graphql.app.api.controller;


import com.beratyesbek.modular.graphql.app.api.convertors.AuthorConvertor;
import com.beratyesbek.modular.graphql.app.api.dom.author.AuthorCreateRequest;
import com.beratyesbek.modular.graphql.app.api.dom.author.AuthorReadRequest;
import com.beratyesbek.modular.graphql.app.services.AuthorService;
import com.beratyesbek.modular.graphql.app.database.entities.Author;
import lombok.extern.slf4j.Slf4j;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
@Slf4j
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @MutationMapping
    public AuthorReadRequest createAuthor(@Argument AuthorCreateRequest author) {
       Author createdAuthor = authorService.create(
                AuthorConvertor.convertAuthorCreateRequestToAuthor(author)
        );
        return AuthorConvertor.convertAuthorToAuthorReadRequest(createdAuthor);
    }

    @QueryMapping
    public AuthorReadRequest findAuthorById(@Argument int id) {
        Author author = authorService.findById(id);
        return  AuthorConvertor.convertAuthorToAuthorReadRequest(author);
    }
}
