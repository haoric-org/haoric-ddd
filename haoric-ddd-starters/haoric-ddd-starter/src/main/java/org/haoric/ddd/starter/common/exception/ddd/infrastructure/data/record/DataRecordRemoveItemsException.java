package org.haoric.ddd.starter.common.exception.ddd.infrastructure.data.record;

import org.haoric.ddd.starter.common.exception.error.code.ErrorCode;

/**
 * DataRecordRemoveItemsException
 * <p>
 * create 2025/08/21 01:28
 * <p>
 * update 2025/08/21 01:34
 *
 * @author Deng Haozhi
 * @see org.haoric.ddd.starter.common.exception.ddd.infrastructure.data.record.DataRecordException
 * @since 1.0.0
 */
public class DataRecordRemoveItemsException extends org.haoric.ddd.starter.common.exception.ddd.infrastructure.data.record.DataRecordException {

    private static final ErrorCode ERROR_CODE = ErrorCode.DDR0203;

    public DataRecordRemoveItemsException() {
        super(null, ERROR_CODE, null, null);
    }

    public DataRecordRemoveItemsException(String message) {
        super(null, ERROR_CODE, message, null);
    }

    public DataRecordRemoveItemsException(Throwable throwable) {
        super(null, ERROR_CODE, null, throwable);
    }

    public DataRecordRemoveItemsException(String method, String message) {
        super(method, ERROR_CODE, message, null);
    }

    public DataRecordRemoveItemsException(String message, Throwable throwable) {
        super(null, ERROR_CODE, message, throwable);
    }

    public DataRecordRemoveItemsException(String method, String message, Throwable throwable) {
        super(method, ERROR_CODE, message, throwable);
    }
}
