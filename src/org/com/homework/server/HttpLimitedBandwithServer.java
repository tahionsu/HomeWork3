package org.com.homework.server;

public class HttpLimitedBandwithServer extends HttpServer {

    public HttpLimitedBandwithServer(String address, int port) {
        super(address, port);
    }

    public HttpLimitedBandwithServer() {
    }

    @Override
    public String sendPostRequest() {
        return "Отправка POST-запроса класса HttpLimitedBandwithServer";
    }

    @Override
    public String sendGetRequest() {
        return "Отправка GET-запроса класса HttpLimitedBandwithServer";
    }
}
