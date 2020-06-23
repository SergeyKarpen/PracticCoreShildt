package main.java.com.sergeykarpen.javacore.chapter18.practice_arrays;

import java.util.ArrayList;

/**
 * Дан массив целых чисел.Необходимо реализовать метод, которые определяет, содержит ли данный массив дубликаты
 */
public class DuplicateArray {

    static int[] defaultArray = {4, 5, 6, 7, 5, 7};
    static int numberIteration;
    static ArrayList<Integer> list = new ArrayList<>();
    static boolean aBoolean = false;

    public static void main(String[] args) {

        addIntToArray(list);
        searchMatches(list);
        if (aBoolean) {
            System.out.println(true);
        } else System.out.println(false + "\n" + "Совпадений не найдено");
    }


    /**
     *
     * @param list
     * @return true если число повторяется больше 1 раза в массивеж
     */
    public static boolean searchMatches(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < defaultArray.length; j++) {
                if (list.get(i).equals(defaultArray[j])) {
                    numberIteration++;
                    if (numberIteration > 1) {
                        aBoolean = true;
                        System.out.println("Число " + list.get(i) + " повторяется " + numberIteration + " раз");
                    }
                }
            }
            numberIteration = 0;

        }
        return aBoolean;
    }


    /**
     *
     * @param list пробеагем по исходному массиву и добавляем в list все значения которые не повторяются;
     */
    public static void addIntToArray(ArrayList<Integer> list) {
        for (int value : defaultArray) {
            if (!list.contains(value)) {
                list.add(value);
            }
        }
    }
}
