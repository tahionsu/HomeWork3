package org.com.homework.server;

public class HttpServer extends AbstractServer {

    public HttpServer(String address, int port) {
        super.setAddress(address);
        super.setPort(port);
    }

    public HttpServer() {
    }

    @Override
    public void sendPostRequest() {
        System.out.println("Отправка POST-запроса класса HttpRequest");
    }

    @Override
    public void sendGetRequest() {
        System.out.println("Отправка GET-запроса класса HttpRequest");
    }
}
