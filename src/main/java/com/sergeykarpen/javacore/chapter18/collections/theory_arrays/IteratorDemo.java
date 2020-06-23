package main.java.com.sergeykarpen.javacore.chapter18.collections.theory_arrays;

import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("C");
        arrayList.add("A");
        arrayList.add("E");
        arrayList.add("N");
        arrayList.add("R");
        arrayList.add("Q");

        //Использовать итераторы для вывода содержимого
        System.out.print("Исодное содержимое списочного массива: ");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.print(element + " ");
        }
        //видоизменить перебираемые объекты
        ListIterator<String> listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            String element = listIterator.next();
            listIterator.set(element + "+");
        }
        System.out.print("\n" + "Измененное содержимое списочного массива: ");
        iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.print(element + " ");
        }
        //отобразить список в обратном порядке
        System.out.print("\n" + "Измененный список в обратном порядке: ");
        while (listIterator.hasPrevious()) {
            String element = listIterator.previous();
            System.out.print(element + " ");
        }









    }
}
