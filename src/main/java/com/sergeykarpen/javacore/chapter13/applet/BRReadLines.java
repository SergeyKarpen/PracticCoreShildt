package main.java.com.sergeykarpen.javacore.chapter13.applet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRReadLines {
    public static void main(String[] args) throws IOException {

        //создать поток ввода типо BufferReader,
        //используя стандарьтный поток ввода System.in

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        System.out.println("Введиет строки текста");
        System.out.println("Введиет 'стоп' для завершения");

        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equalsIgnoreCase("стоп"));


    }
}
