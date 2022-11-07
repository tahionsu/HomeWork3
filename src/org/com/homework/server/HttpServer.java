package org.com.homework.server;

public class HttpServer extends AbstractServer {

    public HttpServer(String address, int port) {
        super.setAddress(address);
        super.setPort(port);
    }

    public HttpServer() {
    }


    @Override
    public String sendPostRequest() {
        return null;
    }

    @Override
    public String sendGetRequest() {
        return null;
    }
}
