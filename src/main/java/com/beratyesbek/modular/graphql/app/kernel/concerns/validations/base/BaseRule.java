package com.beratyesbek.modular.graphql.app.kernel.concerns.validations.base;

import com.beratyesbek.modular.graphql.app.kernel.concerns.validations.results.ValidationErrorRuleResult;
import com.beratyesbek.modular.graphql.app.kernel.concerns.validations.results.ValidationRuleResult;
import com.beratyesbek.modular.graphql.app.kernel.concerns.validations.results.ValidationSuccessRuleResult;

public interface BaseRule extends RuleForStrings, RuleForNumbers {

    default ValidationRuleResult notNull(Object object, String message) {
        if (object != null) {
            return new ValidationSuccessRuleResult("");
        }
        return new ValidationErrorRuleResult(message);
    }

    default ValidationRuleResult notEmpty(String value, String message) {
        if (value.isEmpty())
            return new ValidationErrorRuleResult(message);
        return new ValidationSuccessRuleResult("");
    }
}
