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
        return "Отправка POST-запроса класса HttpRequest";
    }

    @Override
    public String sendGetRequest() {
        return "Отправка GET-запроса класса HttpRequest";
    }
}
