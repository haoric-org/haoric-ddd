package org.haoric.ddd.starter.common.exception.ddd.domain.entity.entity;

import org.haoric.ddd.starter.common.exception.error.code.ErrorCode;

/**
 * EntityModifyException
 * <p>
 * create 2025/08/10 08:34
 * <p>
 * update 2025/08/10 08:35
 *
 * @author Deng Haozhi
 * @see org.haoric.ddd.starter.common.exception.ddd.domain.entity.entity.EntityException
 * @since 1.0.0
 */
public class EntityModifyException extends org.haoric.ddd.starter.common.exception.ddd.domain.entity.entity.EntityException {

    private static final ErrorCode ERROR_CODE = ErrorCode.DEN0102;

    public EntityModifyException() {
        super(null, ERROR_CODE, null, null);
    }

    public EntityModifyException(String message) {
        super(null, ERROR_CODE, message, null);
    }

    public EntityModifyException(Throwable throwable) {
        super(null, ERROR_CODE, null, throwable);
    }

    public EntityModifyException(String method, String message) {
        super(method, ERROR_CODE, message, null);
    }

    public EntityModifyException(String message, Throwable throwable) {
        super(null, ERROR_CODE, message, throwable);
    }

    public EntityModifyException(String method, String message, Throwable throwable) {
        super(method, ERROR_CODE, message, throwable);
    }
}
