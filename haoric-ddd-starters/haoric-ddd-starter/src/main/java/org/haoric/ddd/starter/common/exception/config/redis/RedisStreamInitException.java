package org.haoric.ddd.starter.common.exception.config.redis;

import org.haoric.ddd.starter.common.exception.error.code.ErrorCode;

/**
 * RedisStreamInitException
 * <p>
 * create 2025/07/10 04:59
 * <p>
 * update 2025/07/10 05:01
 *
 * @author Deng Haozhi
 * @see org.haoric.ddd.starter.common.exception.config.redis.RedisStreamConfigException
 * @since 1.0.0
 */
public class RedisStreamInitException extends org.haoric.ddd.starter.common.exception.config.redis.RedisStreamConfigException {

    private static final ErrorCode ERROR_CODE = ErrorCode.CFG0421;

    public RedisStreamInitException() {
        super(null, ERROR_CODE, null, null);
    }

    public RedisStreamInitException(String message) {
        super(null, ERROR_CODE, message, null);
    }

    public RedisStreamInitException(Throwable throwable) {
        super(null, ERROR_CODE, null, throwable);
    }

    public RedisStreamInitException(String method, String message) {
        super(method, ERROR_CODE, message, null);
    }

    public RedisStreamInitException(String message, Throwable throwable) {
        super(null, ERROR_CODE, message, throwable);
    }

    public RedisStreamInitException(String method, String message, Throwable throwable) {
        super(method, ERROR_CODE, message, throwable);
    }
}
