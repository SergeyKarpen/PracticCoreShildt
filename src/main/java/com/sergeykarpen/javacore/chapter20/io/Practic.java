package main.java.com.sergeykarpen.javacore.chapter20.io;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Practic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (FileWriter writer = new FileWriter("ForPractic", true)) {
            String text = scanner.nextLine();
            try {
                writer.write(text);
            } catch (IOException ex) {
                ex.printStackTrace();
            }

            try {
                writer.flush();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


