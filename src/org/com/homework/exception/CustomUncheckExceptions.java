package org.com.homework.exception;

public class CustomUncheckExceptions extends Error {

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    public CustomUncheckExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    @Override
    public synchronized Throwable initCause(Throwable cause) {
        return super.initCause(cause);
    }
}
