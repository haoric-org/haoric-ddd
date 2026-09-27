package org.haoric.ddd.starter.common.exception.ddd.infrastructure.data.record;

import org.haoric.ddd.starter.common.exception.error.code.ErrorCode;

/**
 * DataRecordToException
 * <p>
 * create 2025/08/21 01:26
 * <p>
 * update 2025/08/21 01:27
 *
 * @author Deng Haozhi
 * @see org.haoric.ddd.starter.common.exception.ddd.infrastructure.data.record.DataRecordException
 * @since 1.0.0
 */
public class DataRecordToException extends org.haoric.ddd.starter.common.exception.ddd.infrastructure.data.record.DataRecordException {

    private static final ErrorCode ERROR_CODE = ErrorCode.DDR0101;

    public DataRecordToException() {
        super(null, ERROR_CODE, null, null);
    }

    public DataRecordToException(String message) {
        super(null, ERROR_CODE, message, null);
    }

    public DataRecordToException(Throwable throwable) {
        super(null, ERROR_CODE, null, throwable);
    }

    public DataRecordToException(String method, String message) {
        super(method, ERROR_CODE, message, null);
    }

    public DataRecordToException(String message, Throwable throwable) {
        super(null, ERROR_CODE, message, throwable);
    }

    public DataRecordToException(String method, String message, Throwable throwable) {
        super(method, ERROR_CODE, message, throwable);
    }
}
