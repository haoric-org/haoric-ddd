package org.haoric.ddd.starter.common.exception.ddd.infrastructure.data.record;

import org.haoric.ddd.starter.common.exception.error.code.ErrorCode;

/**
 * DataRecordParameterNullException
 * <p>
 * create 2025/08/21 01:29
 * <p>
 * update 2025/08/21 01:32
 *
 * @author Deng Haozhi
 * @see org.haoric.ddd.starter.common.exception.ddd.infrastructure.data.record.DataRecordException
 * @since 1.0.0
 */
public class DataRecordParameterNullException extends org.haoric.ddd.starter.common.exception.ddd.infrastructure.data.record.DataRecordException {

    private static final ErrorCode ERROR_CODE = ErrorCode.DDR8000;

    public DataRecordParameterNullException() {
        super(null, ERROR_CODE, null, null);
    }

    public DataRecordParameterNullException(String message) {
        super(null, ERROR_CODE, message, null);
    }

    public DataRecordParameterNullException(Throwable throwable) {
        super(null, ERROR_CODE, null, throwable);
    }

    public DataRecordParameterNullException(String method, String message) {
        super(method, ERROR_CODE, message, null);
    }

    public DataRecordParameterNullException(String message, Throwable throwable) {
        super(null, ERROR_CODE, message, throwable);
    }

    public DataRecordParameterNullException(String method, String message, Throwable throwable) {
        super(method, ERROR_CODE, message, throwable);
    }
}
