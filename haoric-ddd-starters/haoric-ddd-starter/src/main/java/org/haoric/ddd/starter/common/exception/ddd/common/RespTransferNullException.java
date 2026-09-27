package org.haoric.ddd.starter.common.exception.ddd.common;

import org.haoric.ddd.starter.common.exception.error.code.ErrorCode;

/**
 * RespTransferNullException
 * <p>
 * create 2025/01/02 14:33
 * <p>
 * update 2025/01/02 14:34
 *
 * @author Deng Haozhi
 * @see org.haoric.ddd.starter.common.exception.ddd.common.TransferNullException
 * @since 1.0.0
 */
public class RespTransferNullException extends org.haoric.ddd.starter.common.exception.ddd.common.TransferNullException {

    private static final ErrorCode ERROR_CODE = ErrorCode.DTO2000;

    public RespTransferNullException() {
        super(null, ERROR_CODE, null, null);
    }

    public RespTransferNullException(String message) {
        super(null, ERROR_CODE, message, null);
    }

    public RespTransferNullException(Throwable throwable) {
        super(null, ERROR_CODE, null, throwable);
    }

    public RespTransferNullException(String method, String message) {
        super(method, ERROR_CODE, message, null);
    }

    public RespTransferNullException(String message, Throwable throwable) {
        super(null, ERROR_CODE, message, throwable);
    }

    public RespTransferNullException(String method, String message, Throwable throwable) {
        super(method, ERROR_CODE, message, throwable);
    }

    public RespTransferNullException(String method, ErrorCode errorCode, String message, Throwable throwable) {
        super(method, errorCode, message, throwable);
    }
}
