package main.java.com.sergeykarpen.javacore.chapter22.tcpip;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class Whois {
    public static void main(String[] args) throws IOException {
// создать сокетное соединение с веб- сайтом internic.net. через порт 43
        int c;

        Socket socket = new Socket("whois.internic.net", 43);

        //полусить поток и ввода-вывода
        InputStream inputStreamReader = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();

        //сформулироватьмстроку запроса
        String str = (args.length == 0 ? "MHProfessional.com" : args[0]) + "\n";

        //преобразовать строку в байты
        byte buf[] = str.getBytes();

        //послать запрос
        outputStream.write(buf);

        //прочитать ответ и вывести его на экран
        while ((c = inputStreamReader.read()) != -1) {
            System.out.println((char) c);
        }
        socket.close();
    }
}
