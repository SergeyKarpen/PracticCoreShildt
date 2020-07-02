package main.java.com.sergeykarpen.javacore.chapter20.nio;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamTryResources {
    public static void main(String[] args) {
        String source = "Now is the time for all good men\n" + " to come to the aid of their country\n" + " and pay their due taxes.";

        byte buf[] = source.getBytes();

        //Применить оператор try с ресурсами для закрытия файлов
        try (FileOutputStream f4 = new FileOutputStream("file4");
             FileOutputStream f5 = new FileOutputStream("file5");
             FileOutputStream f6 = new FileOutputStream("file6")) {
            //записать данные в фаил files4.txt
            for (int i = 0; i < buf.length; i += 2) f4.write(buf[i]);

            //записать данные в фаил files5.txt
            f5.write(buf);

            //записать данные в files6.txt
            f6.write(buf, buf.length - buf.length / 4, buf.length / 4);
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода");
        }
    }
}
