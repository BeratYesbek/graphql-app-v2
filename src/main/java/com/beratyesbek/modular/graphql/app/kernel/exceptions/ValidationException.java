package com.beratyesbek.modular.graphql.app.kernel.exceptions;

import lombok.Getter;

import java.util.List;

@Getter
public class ValidationException extends Exception{
    private final List<String> errorMessages;

    public ValidationException(List<String> errorMessages, String message) {
        super(message);
        this.errorMessages = errorMessages;
    }
}
