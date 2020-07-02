package main.java.com.sergeykarpen.javacore.chapter21.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class PathDemo {
    public static void main(String[] args) {

        Path filepath = Paths.get("examples\\test.txt");
        System.out.println("Имя файла: " + filepath.getName(1));
        System.out.println("путь к файлу: " + filepath);
        System.out.println("Абсолютный путь к файлу: " + filepath.toAbsolutePath());
        System.out.println("Родительский каталог: " + filepath.getParent());

        if (Files.exists(filepath))
            System.out.println("Фаил существует");
        else System.out.println("Фаил не существует");

        try {
            if (Files.isHidden(filepath))
                System.out.println("Фаил скрыт");
            else
                System.out.println("Фаил не скрыт");
        } catch (IOException e) {
            System.out.println("Ошибка ввода - вывода " + e);
        }
        Files.isWritable(filepath);
        System.out.println("Фаил не доступен для  записи");

        Files.isReadable(filepath);
        System.out.println("Фаил не доступен для чтения");

        try {
            BasicFileAttributes attributes = Files.readAttributes(filepath, BasicFileAttributes.class);

            if (attributes.isDirectory())
                System.out.println("Это каталог");
            else System.out.println("Это не каталог");

            if (attributes.isRegularFile())
                System.out.println("Это обычнй фаил");
            else System.out.println("Это не обычный фаил блиатЬ");

            if (attributes.isSymbolicLink())
                System.out.println("Это символическая ссылка");
            else System.out.println("Это не символическая ссылка");

            System.out.println("Время последней модификации файла: " + attributes.lastModifiedTime());
            System.out.println("Размер фаил: " + attributes.size() + "байтов");
        } catch (IOException e) {
            System.out.println("Ошибка чтения атриьбутов: " + e);
        }
    }
}
