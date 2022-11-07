package org.com.homework.exception;

public class RequestException extends Exception {

    public RequestException(String msg) {
        super(msg);
    }

    @Override
    public StackTraceElement[] getStackTrace() {
        return super.getStackTrace();
    }
}
