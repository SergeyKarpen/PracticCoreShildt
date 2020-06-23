package main.java.com.sergeykarpen.javacore.chapter18.collections.theory_arrays;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("F");
        linkedList.add("K");
        linkedList.add("L");
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("F");
        linkedList.addLast("Z");
        linkedList.addFirst("A");
        linkedList.add(1, "A2");

        System.out.println("Исходное содержимое связного списка: " + linkedList);

        //Удлаить элементы из списка
        linkedList.remove("F");
        linkedList.remove(2);
        System.out.println("Содержимое связного спика после удаления элементов: " + linkedList);

        //Удалить первый и последний элемент
        linkedList.removeFirst();
        linkedList.removeLast();

        System.out.println("Содержимое списка после удаления первого и последнего элемента " + linkedList);

        //Получить и присвоить значения
        String string = linkedList.get(2);
        linkedList.set(2, string + " изменено");

        System.out.println("Содежрание списка после изменения: " + linkedList);



    }
}
