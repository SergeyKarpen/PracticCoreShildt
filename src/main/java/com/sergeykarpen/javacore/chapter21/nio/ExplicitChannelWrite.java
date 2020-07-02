package main.java.com.sergeykarpen.javacore.chapter21.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ExplicitChannelWrite {
    public static int mySizeBuffer = 26;

    public static void main(String[] args) {

        //получить канал к файлу в ьблдоке try с ресурсами

        try (FileChannel fileChannel = (FileChannel) Files.newByteChannel(Paths.get("test.txt"), StandardOpenOption.WRITE, StandardOpenOption.CREATE)) {
            //создадим буфер
            ByteBuffer byteBuffer = ByteBuffer.allocate(mySizeBuffer);

            //записать некторое количество байтов в буфер
            for (int i = 0; i < mySizeBuffer; i++)
                byteBuffer.put((byte) ('A' + i));

            //подготовим буфер к записи данных
            byteBuffer.rewind();

            //запишгим данные из буфера в выхондой фаил
            fileChannel.write(byteBuffer);
        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода данных " + e);
            System.out.println(1);
        }
    }
}
