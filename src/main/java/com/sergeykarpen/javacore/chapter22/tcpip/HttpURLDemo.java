package main.java.com.sergeykarpen.javacore.chapter22.tcpip;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HttpURLDemo {
    public static void main(String[] args) throws IOException {

        URL hp = new URL("http://www.googl.com");
        HttpURLConnection hpCon = (HttpURLConnection) hp.openConnection();

        //вывечти метод запроса
        System.out.println("Метод запроса: " + hpCon.getRequestMethod());

        //вывести код ответа
        System.out.println("Код ответа: " + hpCon.getResponseCode());

        //вывести ответное сообщение
        System.out.println("Ответное сообщение: " + hpCon.getResponseMessage());

        //получить список полей и множество ключей из заголовка
        Map<String, List<String>> hdrMap = hpCon.getHeaderFields();
        Set<String> hdField = hdrMap.keySet();
        System.out.println("\nДалее следует заголовок:");

        //вывести все ключи и значения из заголовка
        for (String k : hdField) {
            System.out.println("Ключи: " + k + " Значения: " + hdrMap.get(k));
        }
    }
}
