package com.beratyesbek.modular.graphql.app.kernel.concerns.validations.results;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ValidationSuccessRuleResult extends ValidationRuleResult{
    public ValidationSuccessRuleResult(String message) {
        super(true, message);
    }
}
