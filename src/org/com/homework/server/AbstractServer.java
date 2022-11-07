package org.com.homework.server;

import org.com.homework.exception.RequestException;

public abstract class AbstractServer implements Server {

    protected String address;
    protected int port;

    protected String getAddress() {
        return address;
    }

    protected void setAddress(String address) {
        this.address = address;
    }

    protected int getPort() {
        return port;
    }

    protected void setPort(int port) {
        this.port = port;
    }

    @Override
    public abstract void sendPostRequest() throws RequestException;

    @Override
    public abstract void sendGetRequest() throws RequestException;

    public void closeConnection() {
        System.out.println("Соединение закрыто");
    }
}
