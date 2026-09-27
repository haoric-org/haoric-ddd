package org.haoric.ddd.starter.common.exception.ddd.infrastructure.data.manager;

import org.haoric.ddd.starter.common.exception.error.code.ErrorCode;

/**
 * DataManagerFailedException
 * <p>
 * create 2024/09/29 10:55
 * <p>
 * update 2025/08/21 00:12
 *
 * @author Deng Haozhi
 * @see org.haoric.ddd.starter.common.exception.ddd.infrastructure.data.manager.DataManagerFailedException
 * @since 1.0.0
 */
public class DataManagerParameterNullException extends org.haoric.ddd.starter.common.exception.ddd.infrastructure.data.manager.DataManagerFailedException {

    private static final ErrorCode ERROR_CODE = ErrorCode.DDM8000;

    public DataManagerParameterNullException() {
        super(null, ERROR_CODE, null, null);
    }

    public DataManagerParameterNullException(String message) {
        super(null, ERROR_CODE, message, null);
    }

    public DataManagerParameterNullException(Throwable throwable) {
        super(null, ERROR_CODE, null, throwable);
    }

    public DataManagerParameterNullException(String method, String message) {
        super(method, ERROR_CODE, message, null);
    }

    public DataManagerParameterNullException(String message, Throwable throwable) {
        super(null, ERROR_CODE, message, throwable);
    }

    public DataManagerParameterNullException(String method, String message, Throwable throwable) {
        super(method, ERROR_CODE, message, throwable);
    }
}
