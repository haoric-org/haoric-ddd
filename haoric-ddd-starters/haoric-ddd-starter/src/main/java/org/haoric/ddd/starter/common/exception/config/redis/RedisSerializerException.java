package org.haoric.ddd.starter.common.exception.config.redis;

import org.haoric.ddd.starter.common.exception.error.code.ErrorCode;

/**
 * RedisSerializerException
 * <p>
 * create 2025/07/09 18:25
 * <p>
 * update 2025/07/09 18:25
 *
 * @author Deng Haozhi
 * @see org.haoric.ddd.starter.common.exception.config.redis.RedisConfigException
 * @since 1.0.0
 */
public class RedisSerializerException extends org.haoric.ddd.starter.common.exception.config.redis.RedisConfigException {

    private static final ErrorCode ERROR_CODE = ErrorCode.CFG0410;

    public RedisSerializerException() {
        super(null, ERROR_CODE, null, null);
    }

    public RedisSerializerException(String message) {
        super(null, ERROR_CODE, message, null);
    }

    public RedisSerializerException(Throwable throwable) {
        super(null, ERROR_CODE, null, throwable);
    }

    public RedisSerializerException(String method, String message) {
        super(method, ERROR_CODE, message, null);
    }

    public RedisSerializerException(String message, Throwable throwable) {
        super(null, ERROR_CODE, message, throwable);
    }

    public RedisSerializerException(String method, String message, Throwable throwable) {
        super(method, ERROR_CODE, message, throwable);
    }
}
