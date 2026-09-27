package org.haoric.ddd.starter.common.exception.security.token;

import org.haoric.ddd.starter.common.exception.error.code.ErrorCode;

/**
 * TokenExpiresException
 * <p>
 * create 2024/12/25 13:57
 * <p>
 * update 2025/08/21 04:07
 *
 * @author Deng Haozhi
 * @see org.haoric.ddd.starter.common.exception.security.token.TokenException
 * @since 1.0.0
 */
public class TokenExpiredException extends org.haoric.ddd.starter.common.exception.security.token.TokenException {

    private static final ErrorCode ERROR_CODE = ErrorCode.SEC0034;

    public TokenExpiredException() {
        super(null, ERROR_CODE, null, null);
    }

    public TokenExpiredException(String message) {
        super(null, ERROR_CODE, message, null);
    }

    public TokenExpiredException(Throwable throwable) {
        super(null, ERROR_CODE, null, throwable);
    }

    public TokenExpiredException(String method, String message) {
        super(method, ERROR_CODE, message, null);
    }

    public TokenExpiredException(String message, Throwable throwable) {
        super(null, ERROR_CODE, message, throwable);
    }

    public TokenExpiredException(String method, String message, Throwable throwable) {
        super(method, ERROR_CODE, message, throwable);
    }
}
