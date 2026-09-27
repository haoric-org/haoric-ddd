package org.haoric.ddd.starter.common.exception.ddd.infrastructure.data.persistence.mapper;

import org.haoric.ddd.starter.common.exception.error.code.ErrorCode;

/**
 * MybatisSaveUnknownException
 * <p>
 * create 2024/09/12 12:12
 * <p>
 * update 2025/07/19 02:58
 *
 * @author Deng Haozhi
 * @see org.haoric.ddd.starter.common.exception.ddd.infrastructure.data.persistence.mapper.MybatisUnknownException
 * @since 1.0.0
 */
public class MybatisSaveUnknownException extends org.haoric.ddd.starter.common.exception.ddd.infrastructure.data.persistence.mapper.MybatisUnknownException {

    private static final ErrorCode ERROR_CODE = ErrorCode.MBT9001;

    public MybatisSaveUnknownException() {
        super(null, ERROR_CODE, null, null);
    }

    public MybatisSaveUnknownException(String message) {
        super(null, ERROR_CODE, message, null);
    }

    public MybatisSaveUnknownException(Throwable throwable) {
        super(null, ERROR_CODE, null, throwable);
    }

    public MybatisSaveUnknownException(String method, String message) {
        super(method, ERROR_CODE, message, null);
    }

    public MybatisSaveUnknownException(String message, Throwable throwable) {
        super(null, ERROR_CODE, message, throwable);
    }

    public MybatisSaveUnknownException(String method, String message, Throwable throwable) {
        super(method, ERROR_CODE, message, throwable);
    }
}
