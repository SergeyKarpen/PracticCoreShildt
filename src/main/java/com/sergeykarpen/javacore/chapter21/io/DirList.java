package main.java.com.sergeykarpen.javacore.chapter21.io;

import java.io.File;

public class DirList {
    public static void main(String[] args) {
        String dirname = "src/main/java/com/";
        File fl = new File(dirname);
        if (fl.isDirectory()) {
            System.out.println("Каталог " + dirname);
            String s[] = fl.list();

            for (int i = 0; i < s.length; i++) {
                File f = new File(dirname + "/" + s[i]);
                if (f.isDirectory()) {
                } else {
                    System.out.println(s[i] + " является каталогом");
                }
            }
        } else {
            System.out.println(dirname + " не является каталогом");
        }
    }
}
