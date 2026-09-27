package org.haoric.ddd.starter.common.annotation.validator.ddd;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.haoric.ddd.starter.common.annotation.validate.ddd.Transfer;
import org.haoric.ddd.starter.common.exception.ddd.common.TransferValidateException;

/**
 * TransferConstraintValidator
 * <p>
 * create 2025/08/07 23:20
 * <p>
 * update 2025/08/07 23:58
 *
 * @author Deng Haozhi
 * @see ConstraintValidator
 * @since 1.0.0
 */
public class TransferConstraintValidator implements ConstraintValidator<Transfer, Object> {

    @Override
    public boolean isValid(Object object, ConstraintValidatorContext constraintValidatorContext) {
        if (object instanceof org.haoric.ddd.starter.common.ddd.common.transfer.Transfer transfer) {
            transfer.validate();
            return true;
        } else {
            throw new TransferValidateException("@Transfer注解必须在传输对象上使用");
        }
    }
}
