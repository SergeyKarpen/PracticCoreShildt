package main.java.com.sergeykarpen.javacore.chaprer18;

//Преобразовать списочный массив ArrayList в обычный массив

import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        //ввести элементы в списочный массив
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        System.out.println("Содержимое списочного массива arrayList: " + arrayList);

        //Получить обынчый массив
        Integer integer[] = new Integer[arrayList.size()];
        integer = arrayList.toArray(integer);

        int sum = 0;

        //Суммируем элементы массива

        for (int i : integer) sum += i;
        System.out.println("Сумма: " + sum);

    }
}
