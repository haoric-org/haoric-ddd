package org.haoric.ddd.starter.common.exception.config.rest;

import org.haoric.ddd.starter.common.exception.error.code.ErrorCode;

/**
 * RestServerFailedException
 * <p>
 * create 2025/08/20 23:09
 * <p>
 * update 2025/08/20 23:09
 *
 * @author Deng Haozhi
 * @see org.haoric.ddd.starter.common.exception.config.rest.RestFailedException
 * @since 1.0.0
 */
public class RestServerFailedException extends org.haoric.ddd.starter.common.exception.config.rest.RestFailedException {

    private static final ErrorCode ERROR_CODE = ErrorCode.RES0100;

    public RestServerFailedException() {
        super(null, ERROR_CODE, null, null);
    }

    public RestServerFailedException(String message) {
        super(null, ERROR_CODE, message, null);
    }

    public RestServerFailedException(Throwable throwable) {
        super(null, ERROR_CODE, null, throwable);
    }

    public RestServerFailedException(String method, String message) {
        super(method, ERROR_CODE, message, null);
    }

    public RestServerFailedException(String message, Throwable throwable) {
        super(null, ERROR_CODE, message, throwable);
    }

    public RestServerFailedException(String method, String message, Throwable throwable) {
        super(method, ERROR_CODE, message, throwable);
    }

    public RestServerFailedException(String method, ErrorCode errorCode, String message, Throwable throwable) {
        super(method, errorCode, message, throwable);
    }
}
