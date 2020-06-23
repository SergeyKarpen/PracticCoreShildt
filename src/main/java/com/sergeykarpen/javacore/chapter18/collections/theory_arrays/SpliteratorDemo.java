package main.java.com.sergeykarpen.javacore.chapter18.collections.theory_arrays;

import java.util.ArrayList;
import java.util.Spliterator;

public class SpliteratorDemo {
    public static void main(String[] args) {
        ArrayList<Double> arrayList = new ArrayList<>();
        arrayList.add(1.0);
        arrayList.add(2.0);
        arrayList.add(3.0);
        arrayList.add(4.0);
        arrayList.add(5.0);
        //метод tryAdvance() для вывода сожердимогосписочного массива
        System.out.println("Сожерджиоме списочногго массива:\n");
        Spliterator<Double> spliterator = arrayList.spliterator();
        while (spliterator.tryAdvance((n) -> System.out.println(n))) ;

        /*
        Создать новый списочный массив, содержащий квадратные корни
        числовых значений из списочного массива
        */
        spliterator = arrayList.spliterator();
        ArrayList<Double> arrayList1 = new ArrayList<>();
        while (spliterator.tryAdvance((n) -> arrayList1.add(Math.sqrt(n)))) ;

        /*
        Вызвать метод forEachRamaining() для вывода содержимого
        списочного массива
         */
        System.out.println("Содержимое списочного массива arraylist1: \n");
        spliterator = arrayList1.spliterator();
        spliterator.forEachRemaining((n) -> System.out.println(n));

    }
}
