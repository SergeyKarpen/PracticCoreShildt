package main.java.com.sergeykarpen.javacore.chapter20.nio;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutStreamDemoJDK7 {
    public static void main(String[] args) {
        String source = "Now is the time for all good men\n" + " to come to the aid of their country\n" + " and pay their due taxes.";
        byte buf[] = source.getBytes();
        FileOutputStream f0 = null;
        FileOutputStream f1 = null;
        FileOutputStream f2 = null;

        try {
            f0 = new FileOutputStream("file1.txt");
            f1 = new FileOutputStream("file2.txt");
            f2 = new FileOutputStream("file3.txt");

            //записать данные в первый фаил
            for (int i = 0; i < buf.length; i += 2)
                f0.write(buf[i]);

            //записать данные во второй фаил
            f1.write(buf);

            //записать данные в третий фаил
            f2.write(buf, buf.length - buf.length / 4, buf.length / 4);
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода");
        } finally {
            try {
                if (f0 != null) f0.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла file1.txt");
            }
            try {
                if (f1 != null) f1.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла file2.txt");
            }
            try {
                if (f2 != null) f2.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла file3.txt");
            }
        }
    }
}