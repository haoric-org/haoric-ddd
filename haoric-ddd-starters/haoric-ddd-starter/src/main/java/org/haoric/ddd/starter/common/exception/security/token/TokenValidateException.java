package org.haoric.ddd.starter.common.exception.security.token;

import org.haoric.ddd.starter.common.exception.error.code.ErrorCode;

/**
 * TokenValidateException
 * <p>
 * create 2024/12/25 13:52
 * <p>
 * update 2024/12/25 13:53
 *
 * @author Deng Haozhi
 * @see org.haoric.ddd.starter.common.exception.security.token.TokenException
 * @since 1.0.0
 */
public class TokenValidateException extends org.haoric.ddd.starter.common.exception.security.token.TokenException {

    private static final ErrorCode ERROR_CODE = ErrorCode.SEC0033;

    public TokenValidateException() {
        super(null, ERROR_CODE, null, null);
    }

    public TokenValidateException(String message) {
        super(null, ERROR_CODE, message, null);
    }

    public TokenValidateException(Throwable throwable) {
        super(null, ERROR_CODE, null, throwable);
    }

    public TokenValidateException(String method, String message) {
        super(method, ERROR_CODE, message, null);
    }

    public TokenValidateException(String message, Throwable throwable) {
        super(null, ERROR_CODE, message, throwable);
    }

    public TokenValidateException(String method, String message, Throwable throwable) {
        super(method, ERROR_CODE, message, throwable);
    }
}
