package org.haoric.ddd.starter.common.exception.ddd.infrastructure.data.persistence.mapper;

import org.haoric.ddd.starter.common.exception.error.code.ErrorCode;

/**
 * MybatisSaveFailedException
 * <p>
 * create 2024/09/12 12:12
 * <p>
 * update 2025/07/19 02:57
 *
 * @author Deng Haozhi
 * @see org.haoric.ddd.starter.common.exception.ddd.infrastructure.data.persistence.mapper.MybatisFailedException
 * @since 1.0.0
 */
public class MybatisSaveFailedException extends org.haoric.ddd.starter.common.exception.ddd.infrastructure.data.persistence.mapper.MybatisFailedException {

    private static final ErrorCode ERROR_CODE = ErrorCode.MBT0001;

    public MybatisSaveFailedException() {
        super(null, ERROR_CODE, null, null);
    }

    public MybatisSaveFailedException(String message) {
        super(null, ERROR_CODE, message, null);
    }

    public MybatisSaveFailedException(Throwable throwable) {
        super(null, ERROR_CODE, null, throwable);
    }

    public MybatisSaveFailedException(String method, String message) {
        super(method, ERROR_CODE, message, null);
    }

    public MybatisSaveFailedException(String message, Throwable throwable) {
        super(null, ERROR_CODE, message, throwable);
    }

    public MybatisSaveFailedException(String method, String message, Throwable throwable) {
        super(method, ERROR_CODE, message, throwable);
    }
}
