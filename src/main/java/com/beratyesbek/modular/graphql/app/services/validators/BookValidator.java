package com.beratyesbek.modular.graphql.app.services.validators;

import com.beratyesbek.modular.graphql.app.database.entities.Book;
import com.beratyesbek.modular.graphql.app.kernel.concerns.validations.Validator;
import com.beratyesbek.modular.graphql.app.kernel.exceptions.ValidationException;

public class BookValidator implements Validator<Book> {
    @Override
    public void validate(Book entity) throws ValidationException {
        invoke(
                lessThanAndGreaterThan(entity.getName(), 3, 20, "name cannot be less than 3 characters and grater than 20"),
                graderThan(entity.getPageSize(), 10, "Page size must be greater than 10"),
                notEmpty(entity.getForward(), entity.getForward())
        );
    }
}
