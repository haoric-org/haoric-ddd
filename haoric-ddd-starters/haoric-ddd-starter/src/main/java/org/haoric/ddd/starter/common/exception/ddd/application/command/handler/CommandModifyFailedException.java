package org.haoric.ddd.starter.common.exception.ddd.application.command.handler;

import org.haoric.ddd.starter.common.exception.error.code.ErrorCode;

/**
 * CommandModifyFailedException
 * <p>
 * create 2024/09/29 11:14
 * <p>
 * update 2024/11/17 16:08
 *
 * @author Deng Haozhi
 * @see org.haoric.ddd.starter.common.exception.ddd.application.command.handler.CommandFailedException
 * @since 1.0.0
 */
public class CommandModifyFailedException extends org.haoric.ddd.starter.common.exception.ddd.application.command.handler.CommandFailedException {

    private static final ErrorCode ERROR_CODE = ErrorCode.DCD0003;

    public CommandModifyFailedException() {
        super(null, ERROR_CODE, null, null);
    }

    public CommandModifyFailedException(String message) {
        super(null, ERROR_CODE, message, null);
    }

    public CommandModifyFailedException(Throwable throwable) {
        super(null, ERROR_CODE, null, throwable);
    }

    public CommandModifyFailedException(String method, String message) {
        super(method, ERROR_CODE, message, null);
    }

    public CommandModifyFailedException(String message, Throwable throwable) {
        super(null, ERROR_CODE, message, throwable);
    }

    public CommandModifyFailedException(String method, String message, Throwable throwable) {
        super(method, ERROR_CODE, message, throwable);
    }
}
