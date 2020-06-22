package main.java.com.sergeykarpen.javacore.chaprer18.practice_arrays;


import java.util.HashSet;
import java.util.Set;

/**
 * Дан массив целых чисел.Необходимо реализовать метод, которые определяет, содержит ли данный массив дубликаты
 */
public class Task_2 {

    static Integer[] defaultArray = {4, 5, 6, 6, 7, 8, 8, 8};

    public static void main(String[] args) {

        final boolean[] booleans = new boolean[defaultArray.length];
        for (int i = 0; i < defaultArray.length - 1; i++) {
            while (booleans[i]) i++;
            System.out.print(defaultArray[i] + " is repeat in: " + i + " ");
            for (int j = i + 1; j < defaultArray.length; j++) {
                if (defaultArray[i] == defaultArray[j]) {
                    booleans[j] = true;
                    System.out.print(j + " ");
                }
            }
        }
        System.out.println();
    }
}
}
