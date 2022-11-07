package org.com.homework.server;

import org.com.homework.exception.ConnException;
import org.com.homework.exception.RequestException;
import org.com.homework.random.RandomDice;

public class HttpLimitedBandwithServer extends HttpServer {

    public HttpLimitedBandwithServer(String address, int port) throws ConnException {
        if (RandomDice.getRandomDice() > 4) {
            throw new ConnException("Ошибка установки соединения");
        }
        super.setAddress(address);
        super.setPort(port);
    }

    public HttpLimitedBandwithServer() {
    }

    @Override
    public void sendPostRequest() throws RequestException {
        if (RandomDice.getRandomDice() > 4) {
            throw new RequestException("Ошибка в запросе");
        }
        System.out.println("Отправка POST-запроса класса HttpLimitedBandwithServer");
    }

    @Override
    public void sendGetRequest() throws RequestException {
        if (RandomDice.getRandomDice() > 4) {
            throw new RequestException("Ошибка в запросе");
        }
        System.out.println("Отправка GET-запроса класса HttpLimitedBandwithServer");
    }
}
