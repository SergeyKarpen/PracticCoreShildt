package main.java.com.sergeykarpen.javacore.chapter13.applet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TinyEdit {
    public static void main(String[] args)throws IOException {

        //создать поток ввода типо BufferReader,
        //используя стандарьтный поток ввода System.in

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = new String[100];
        System.out.println("Введиет строки текста");
        System.out.println("Введиет 'стоп' для завершения");
for (int i = 0; i<100; i ++) {
    str[i] = br.readLine();
    if (str[i] .equalsIgnoreCase("стоп")) break;
}
        System.out.println("Содержимое вашего файла");
//ввести текстовые строки
        for (int i = 0; i<100; i++){
            if (str[i].equalsIgnoreCase("стоп")) break;
            System.out.println(str[i]);
        }
    }
}
