package org.com.homework.exception;

import java.net.SocketException;

public class ConnException extends SocketException {

    public ConnException(String msg) {
        super(msg);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
