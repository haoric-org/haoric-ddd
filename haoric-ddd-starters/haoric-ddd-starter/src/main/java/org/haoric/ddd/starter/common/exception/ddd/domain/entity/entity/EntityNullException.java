package org.haoric.ddd.starter.common.exception.ddd.domain.entity.entity;

import org.haoric.ddd.starter.common.exception.error.code.ErrorCode;

/**
 * EntityNullException
 * <p>
 * create 2025/08/07 23:54
 * <p>
 * update 2025/08/07 23:56
 *
 * @author Deng Haozhi
 * @see org.haoric.ddd.starter.common.exception.ddd.domain.entity.entity.EntityException
 * @since 1.0.0
 */
public class EntityNullException extends org.haoric.ddd.starter.common.exception.ddd.domain.entity.entity.EntityException {

    private static final ErrorCode ERROR_CODE = ErrorCode.DEN0001;

    public EntityNullException() {
        super(null, ERROR_CODE, null, null);
    }

    public EntityNullException(String message) {
        super(null, ERROR_CODE, message, null);
    }

    public EntityNullException(Throwable throwable) {
        super(null, ERROR_CODE, null, throwable);
    }

    public EntityNullException(String method, String message) {
        super(method, ERROR_CODE, message, null);
    }

    public EntityNullException(String message, Throwable throwable) {
        super(null, ERROR_CODE, message, throwable);
    }

    public EntityNullException(String method, String message, Throwable throwable) {
        super(method, ERROR_CODE, message, throwable);
    }
}
