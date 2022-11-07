package org.com.homework.server;

import org.com.homework.exception.RequestException;

public interface Server {
    public void sendPostRequest() throws RequestException;

    public void sendGetRequest() throws RequestException;
}
