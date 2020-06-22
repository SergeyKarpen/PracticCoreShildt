package main.java.com.sergeykarpen.javacore.chaprer18.practice_arrays;

import java.util.*;

/**
 * Дан массив целых чисел. Необходимо реализовать метод, который возвращает индексы массива, значения которых в сумме дают число переданное в масси
 */


public class Task_1 {

    static int sumArrayPairs = 0;
    static int valuesToDetermine = 18;
    static int[] defaultArray = {3, 8, 15, 17};
    static Set<Integer> uniqueValues = new HashSet<>();

    public static void main(String[] args) {
        System.out.println(results());
    }

    /**
     * Проебагая по массиву с двух сторон находим все пары и после добовляем их в Set - где убираем повторения
     */
    public static Set<Integer> results() {
        for (int i = 0; i < defaultArray.length; i++) {
            for (int j = defaultArray.length - 1; j >= 0; j--) {
                sumArrayPairs = defaultArray[i] + defaultArray[j];
                if (defaultArray[i] != defaultArray[j] && valuesToDetermine == sumArrayPairs) {
                    uniqueValues.add(i);
                    uniqueValues.add(j);
                }
            }
        }
        return uniqueValues;
    }
}