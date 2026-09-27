package org.haoric.ddd.starter.common.exception.ddd.application.query.transfer;

import org.haoric.ddd.starter.common.exception.ddd.common.RespTransferValidateException;
import org.haoric.ddd.starter.common.exception.error.code.ErrorCode;

/**
 * QueryRespTransferValidateException
 * <p>
 * create 2025/08/11 19:34
 * <p>
 * update 2025/08/11 19:37
 *
 * @author Deng Haozhi
 * @see RespTransferValidateException
 * @since 1.0.0
 */
public class QueryRespTransferValidateException extends RespTransferValidateException {

    private static final ErrorCode ERROR_CODE = ErrorCode.DTO2201;

    public QueryRespTransferValidateException() {
        super(null, ERROR_CODE, null, null);
    }

    public QueryRespTransferValidateException(String message) {
        super(null, ERROR_CODE, message, null);
    }

    public QueryRespTransferValidateException(Throwable throwable) {
        super(null, ERROR_CODE, null, throwable);
    }

    public QueryRespTransferValidateException(String method, String message) {
        super(method, ERROR_CODE, message, null);
    }

    public QueryRespTransferValidateException(String message, Throwable throwable) {
        super(null, ERROR_CODE, message, throwable);
    }

    public QueryRespTransferValidateException(String method, String message, Throwable throwable) {
        super(method, ERROR_CODE, message, throwable);
    }
}
