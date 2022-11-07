package org.com.homework.exception;

import java.net.SocketException;

public class ConnException extends SocketException {

    private static int errorCount = 0;

    @Override
    public synchronized Throwable initCause(Throwable cause) {
        return super.initCause(cause);
    }

    public ConnException(String msg) throws CustomUncheckExceptions {
        super(msg);
        errorCount += 1;
    }

    @Override
    public synchronized Throwable getCause() {
        return super.getCause();
    }

    public static int getErrorCount() {
        return errorCount;
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
