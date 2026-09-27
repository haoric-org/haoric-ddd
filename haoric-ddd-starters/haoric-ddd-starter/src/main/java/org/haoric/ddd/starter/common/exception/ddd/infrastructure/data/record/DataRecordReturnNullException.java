package org.haoric.ddd.starter.common.exception.ddd.infrastructure.data.record;

import org.haoric.ddd.starter.common.exception.error.code.ErrorCode;

/**
 * DataRecordReturnNullException
 * <p>
 * create 2025/08/21 01:29
 * <p>
 * update 2025/08/21 01:35
 *
 * @author Deng Haozhi
 * @see org.haoric.ddd.starter.common.exception.ddd.infrastructure.data.record.DataRecordException
 * @since 1.0.0
 */
public class DataRecordReturnNullException extends org.haoric.ddd.starter.common.exception.ddd.infrastructure.data.record.DataRecordException {

    private static final ErrorCode ERROR_CODE = ErrorCode.DDR8100;

    public DataRecordReturnNullException() {
        super(null, ERROR_CODE, null, null);
    }

    public DataRecordReturnNullException(String message) {
        super(null, ERROR_CODE, message, null);
    }

    public DataRecordReturnNullException(Throwable throwable) {
        super(null, ERROR_CODE, null, throwable);
    }

    public DataRecordReturnNullException(String method, String message) {
        super(method, ERROR_CODE, message, null);
    }

    public DataRecordReturnNullException(String message, Throwable throwable) {
        super(null, ERROR_CODE, message, throwable);
    }

    public DataRecordReturnNullException(String method, String message, Throwable throwable) {
        super(method, ERROR_CODE, message, throwable);
    }
}
