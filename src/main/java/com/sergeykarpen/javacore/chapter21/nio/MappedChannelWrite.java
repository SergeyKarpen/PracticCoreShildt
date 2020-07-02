package main.java.com.sergeykarpen.javacore.chapter21.nio;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class MappedChannelWrite {
    public static void main(String[] args) {

//получим данные к файлу в блоке  try с ресурсами
        try (FileChannel fileChannel = (FileChannel) Files.newByteChannel(Paths.get("test.txt"), StandardOpenOption.WRITE, StandardOpenOption.READ, StandardOpenOption.CREATE)) {
            // затем сопоставим файл с буфером
            MappedByteBuffer mappedByteBuffer = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0, 26);

            //записать заданнное количество байтов в буфер
            for (int i = 0; i < 26; i++)
                mappedByteBuffer.put((byte) ('A' + i));
        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути" + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }
    }
}
