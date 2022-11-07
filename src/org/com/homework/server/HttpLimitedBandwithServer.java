package org.com.homework.server;

public class HttpLimitedBandwithServer extends HttpServer {

    public HttpLimitedBandwithServer(String address, int port) {
        super(address, port);
    }

    public HttpLimitedBandwithServer() {
    }

    @Override
    public void sendPostRequest() {
        System.out.println("Отправка POST-запроса класса HttpLimitedBandwithServer");
    }

    @Override
    public void sendGetRequest() {
        System.out.println("Отправка GET-запроса класса HttpLimitedBandwithServer");
    }
}
