package com.beratyesbek.modular.graphql.app.kernel.concerns.validations;

import com.beratyesbek.modular.graphql.app.database.entities.AbstractEntity;
import com.beratyesbek.modular.graphql.app.kernel.concerns.validations.base.BaseRule;
import com.beratyesbek.modular.graphql.app.kernel.concerns.validations.results.ValidationRuleResult;
import com.beratyesbek.modular.graphql.app.kernel.exceptions.ValidationException;

import java.util.ArrayList;
import java.util.List;

public interface Validator<T extends AbstractEntity> extends BaseRule {
    void validate(T entity) throws ValidationException;

    default void invoke(final ValidationRuleResult... validationRules) throws ValidationException {
        List<String> errorMessages = new ArrayList<>();
        boolean exception = false;
        for (ValidationRuleResult item : validationRules) {
            if (!item.isSuccess()) {
                exception = true;
                errorMessages.add(item.getMessage());
            }
        }
        if (exception)
            throw new ValidationException(errorMessages, "Validation Exception");
    }
}
