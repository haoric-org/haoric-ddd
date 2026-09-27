package org.haoric.ddd.starter.common.exception.config.minio;

import org.haoric.ddd.starter.common.exception.error.code.ErrorCode;

/**
 * FileSystemRetrieveFailedException
 * <p>
 * create 2024/09/29 10:55
 * <p>
 * update 2025/08/20 22:37
 *
 * @author Deng Haozhi
 * @see org.haoric.ddd.starter.common.exception.config.minio.MinioFailedException
 * @since 1.0.0
 */
public class MinioRetrieveFailedException extends org.haoric.ddd.starter.common.exception.config.minio.MinioFailedException {

    private static final ErrorCode ERROR_CODE = ErrorCode.MIO0003;

    public MinioRetrieveFailedException() {
        super(null, ERROR_CODE, null, null);
    }

    public MinioRetrieveFailedException(String message) {
        super(null, ERROR_CODE, message, null);
    }

    public MinioRetrieveFailedException(Throwable throwable) {
        super(null, ERROR_CODE, null, throwable);
    }

    public MinioRetrieveFailedException(String method, String message) {
        super(method, ERROR_CODE, message, null);
    }

    public MinioRetrieveFailedException(String message, Throwable throwable) {
        super(null, ERROR_CODE, message, throwable);
    }

    public MinioRetrieveFailedException(String method, String message, Throwable throwable) {
        super(method, ERROR_CODE, message, throwable);
    }
}
