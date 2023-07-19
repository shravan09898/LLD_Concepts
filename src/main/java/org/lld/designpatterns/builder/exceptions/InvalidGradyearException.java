package org.lld.designpatterns.builder.exceptions;

public class InvalidGradyearException extends RuntimeException{
    public InvalidGradyearException() {
    }

    public InvalidGradyearException(String message) {
        super(message);
    }

    public InvalidGradyearException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidGradyearException(Throwable cause) {
        super(cause);
    }

    public InvalidGradyearException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
