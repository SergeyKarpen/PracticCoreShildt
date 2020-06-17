package main.java.com.sergeykarpen.javacore.chaprer18;


import java.util.*;
import java.util.stream.Collectors;

/**
 * Дан массив целых чисел.Необходимо реализовать метод, которые определяет, содержит ли данный массив дубликаты
 */
public class Task_2 {

    static Map<Object, Long> resultValues = new HashMap<>();
    static Integer[] defaultArray = {4, 5, 6, 6, 7, 8, 8, 8};

    public static void main(String[] args) {

        StreamfromArray();
        filerStream();
    }

    /**
     * С помощью Stream API преобразуем массив и подсчитываем количество повторений значенийБ фильтруя пвторения которые >= 1
     */
    public static void StreamfromArray() {
        List<Integer> defaultArrayList = Arrays.asList(defaultArray);
        resultValues = defaultArrayList
                .stream()
                .filter(n -> Collections.frequency(defaultArrayList, n) > 1)
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));
    }

    /**
     * Спомощью Stream API выводим повторябщиеся значения
     */
    public static void filerStream() {
        resultValues.entrySet()
                .forEach(entry -> {
                    System.out.println("Число " + entry.getKey() + " " + "Повторяется " + entry.getValue());
                });

    }
}