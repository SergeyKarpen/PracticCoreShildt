package main.java.com.sergeykarpen.javacore.chapter13.applet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;
        FileOutputStream fon = null;
        //Убедимся что имя файла указано
        if ((args.length != 1)) {
            System.out.println("Использование:  ShowFile TEST.txt");
            return;
        }
        //Попытка открыть файл
        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("Невозможно открыть фаил");
            return;
        }
        //Тперь фаил открыт и готов к чтению.
        //Далее из него читаются символы до тех пор,
        //пока не встретится признак конца файла
        try {
            do {
                i = fin.read();
                if (i != -1) System.out.println((char) i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Ошибк чтения из файла");
        }

        // закрыть фаил
        try {
            fin.close();
        }catch (IOException e) {
            System.out.println("Ошибка закрытия файла");
        }
    }
}
