package main.java.com.sergeykarpen.javacore.chaprer18;

import java.util.*;

/**
 * Дан массив целых чисел. Необходимо реализовать метод, который возвращает индексы массива, значения которых в сумме дают число переданное в масси
 */


public class Task_1 {

    static int sumArrayPairs = 0;
    static int valuesToDetermine;
    static int[] defaultArray = {3, 8, 15, 17, 20};
    static Set<Integer> uniqueValues = new HashSet<>();

    public static void main(String[] args) {
        InputSumOfTwoNumbers();
        Results();
    }


    /**
     * Проебагая по массиву с двух сторон находим все пары числе и после добовляем их в Set - где убираем повторения
     */
    public static void Results() {
        for (int i = 0; i < defaultArray.length; i++) {
            for (int j = defaultArray.length - 1; j >= 0; j--) {
                sumArrayPairs = defaultArray[i] + defaultArray[j];
                if (defaultArray[i] != defaultArray[j] && valuesToDetermine == sumArrayPairs) {
                    uniqueValues.add(i);
                    uniqueValues.add(j);
                }
            }
        }
        System.out.println(uniqueValues);
    }

    /**
     * Просим ввести значения(сумму двух чисел из массива) для поиска в массиве пары индексов
     */
    public static void InputSumOfTwoNumbers() {
        System.out.println("Enter the sum of two numbers from the array {3, 8, 15, 17, 20}");
        Scanner scanner = new Scanner(System.in);
        valuesToDetermine = scanner.nextInt();
    }
}