package org.com.homework.server;

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
    public abstract void sendPostRequest();

    @Override
    public abstract void sendGetRequest();
}
