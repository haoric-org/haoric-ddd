package org.haoric.ddd.starter.common.annotation.validator.ddd;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.haoric.ddd.starter.common.annotation.validate.ddd.Value;
import org.haoric.ddd.starter.common.exception.ddd.domain.value.ValueValidateException;

/**
 * ValueConstraintValidator
 * <p>
 * create 2025/08/20 02:24
 * <p>
 * update 2025/08/20 02:24
 *
 * @author Deng Haozhi
 * @since 1.0.0
 */
public class ValueConstraintValidator implements ConstraintValidator<Value, Object> {

    @Override
    public boolean isValid(Object object, ConstraintValidatorContext constraintValidatorContext) {
        if (object instanceof org.haoric.ddd.starter.common.ddd.domain.value.Value value) {
            value.validate();
            return true;
        } else {
            throw new ValueValidateException("@Value注解必须在值对象上使用");
        }
    }
}
