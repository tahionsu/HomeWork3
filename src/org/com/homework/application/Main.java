package org.com.homework.application;

import org.com.homework.exception.ConnException;
import org.com.homework.exception.CustomUncheckExceptions;
import org.com.homework.exception.RequestException;
import org.com.homework.server.HttpLimitedBandwithServer;
import org.com.homework.server.HttpServer;

public class Main {

    public static void main(String[] args) {

        HttpServer httpServer = null;
        HttpLimitedBandwithServer httpLimitedBandwithServer = null;

        while (true) {
            try {
                try {
                    httpServer = new HttpServer("localhost", 8080);
                    httpLimitedBandwithServer =
                            new HttpLimitedBandwithServer("localhost", 8080);

                    httpServer.sendGetRequest();
                    httpServer.sendPostRequest();
                    httpLimitedBandwithServer.sendGetRequest();
                    httpLimitedBandwithServer.sendPostRequest();
                } catch (ConnException e) {
                    System.out.println(e.getMessage());
                    if (e.getErrorCount() >= 5) {
                        throw new CustomUncheckExceptions("Превышен лимит попыток отправки", e);
                    }
                } catch (RequestException e) {
                    System.out.println(e.getStackTrace());
                } finally {
                    if (httpServer != null) {
                        httpServer.closeConnection();
                    }
                    if (httpLimitedBandwithServer != null) {
                        httpLimitedBandwithServer.closeConnection();
                    }
                }
            } catch (CustomUncheckExceptions e) {
                System.out.println(e.getMessage());
                System.out.println(e.getCause());
                break;
            }
        }
    }
}
