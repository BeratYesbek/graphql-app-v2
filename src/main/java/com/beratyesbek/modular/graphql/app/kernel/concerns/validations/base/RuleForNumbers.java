package com.beratyesbek.modular.graphql.app.kernel.concerns.validations.base;

import com.beratyesbek.modular.graphql.app.kernel.concerns.validations.results.ValidationErrorRuleResult;
import com.beratyesbek.modular.graphql.app.kernel.concerns.validations.results.ValidationRuleResult;
import com.beratyesbek.modular.graphql.app.kernel.concerns.validations.results.ValidationSuccessRuleResult;

public interface RuleForNumbers {

    default ValidationRuleResult graderThan(Number value, Number target, String message) {
        if (value.doubleValue() > target.doubleValue()) {
            return new ValidationSuccessRuleResult("");
        }
        return new ValidationErrorRuleResult(message);
    }

    default ValidationRuleResult graderThanOrEquals(Number value, Number target, String message) {
        if (value.doubleValue() >= target.doubleValue()) {
            return new ValidationSuccessRuleResult("");
        }
        return new ValidationErrorRuleResult(message);
    }

    default ValidationRuleResult lessThan(Number value, Number target, String message) {
        if (value.doubleValue() < target.doubleValue()) {
            return new ValidationSuccessRuleResult("");
        }
        return new ValidationErrorRuleResult(message);
    }

    default ValidationRuleResult lessThanOrEquals(Number value, Number target, String message) {
        if (value.doubleValue() <= target.doubleValue()) {
            return new ValidationSuccessRuleResult("");
        }
        return new ValidationErrorRuleResult(message);
    }
}
