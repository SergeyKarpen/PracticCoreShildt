package main.java.com.sergeykarpen.javacore.chapter21.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExplicitChannelRead {
    public static void main(String[] args) {
        int count;
        Path filepath = null;

        //получим путь к файлу
        try {
            filepath = Paths.get("test.txt");
        } catch (InvalidPathException e) {
            System.out.println("path Error " + e);
            return;
        }

        //теперь получим канал к этому файлу в блоке оператора try с ресурсами
        try (SeekableByteChannel fChan = Files.newByteChannel(filepath)) {

            //выделим памятьпод буфер
            ByteBuffer mBuf = ByteBuffer.allocate(128);

            do {
                //читаем данные из файла
                count = fChan.read(mBuf);

                //прекратить стение по достижении конца файла
                if (count != -1) {

                    //подготовить буфер для чтения из него данных
                    mBuf.rewind();

                    //читать юайты данных из буфера и выводить их на экран как символы
                    for (int i = 0; i < count; i++)
                        System.out.print((char) mBuf.get());
                }
            } while (count != -1);
            System.out.println();

        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывола " + e);
        }
    }
}