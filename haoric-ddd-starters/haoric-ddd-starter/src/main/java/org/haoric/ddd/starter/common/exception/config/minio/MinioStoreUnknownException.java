package org.haoric.ddd.starter.common.exception.config.minio;

import org.haoric.ddd.starter.common.exception.error.code.ErrorCode;

/**
 * FileSystemStoreException
 * <p>
 * create 2024/09/29 10:55
 * <p>
 * update 2025/07/29 22:02
 * update 2025/08/20 22:36
 *
 * @author Deng Haozhi
 * @see org.haoric.ddd.starter.common.exception.config.minio.MinioUnknownException
 * @since 1.0.0
 */
public class MinioStoreUnknownException extends org.haoric.ddd.starter.common.exception.config.minio.MinioUnknownException {

    private static final ErrorCode ERROR_CODE = ErrorCode.MIO9001;

    public MinioStoreUnknownException() {
        super(null, ERROR_CODE, null, null);
    }

    public MinioStoreUnknownException(String message) {
        super(null, ERROR_CODE, message, null);
    }

    public MinioStoreUnknownException(Throwable throwable) {
        super(null, ERROR_CODE, null, throwable);
    }

    public MinioStoreUnknownException(String method, String message) {
        super(method, ERROR_CODE, message, null);
    }

    public MinioStoreUnknownException(String message, Throwable throwable) {
        super(null, ERROR_CODE, message, throwable);
    }

    public MinioStoreUnknownException(String method, String message, Throwable throwable) {
        super(method, ERROR_CODE, message, throwable);
    }
}
