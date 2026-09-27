package org.haoric.ddd.starter.common.exception.ddd.domain.entity.aggregate;

import org.haoric.ddd.starter.common.exception.error.code.ErrorCode;

/**
 * AggregateRemoveItemException
 * <p>
 * create 2025/08/12 00:16
 * <p>
 * update 2025/08/12 00:19
 *
 * @author Deng Haozhi
 * @see org.haoric.ddd.starter.common.exception.ddd.domain.entity.aggregate.AggregateException
 * @since 1.0.0
 */
public class AggregateRemoveItemException extends org.haoric.ddd.starter.common.exception.ddd.domain.entity.aggregate.AggregateException {

    private static final ErrorCode ERROR_CODE = ErrorCode.DAG0202;

    public AggregateRemoveItemException() {
        super(null, ERROR_CODE, null, null);
    }

    public AggregateRemoveItemException(String message) {
        super(null, ERROR_CODE, message, null);
    }

    public AggregateRemoveItemException(Throwable throwable) {
        super(null, ERROR_CODE, null, throwable);
    }

    public AggregateRemoveItemException(String method, String message) {
        super(method, ERROR_CODE, message, null);
    }

    public AggregateRemoveItemException(String message, Throwable throwable) {
        super(null, ERROR_CODE, message, throwable);
    }

    public AggregateRemoveItemException(String method, String message, Throwable throwable) {
        super(method, ERROR_CODE, message, throwable);
    }
}
