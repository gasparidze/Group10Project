package org.example.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * У нас есть 3 основных вида коллекции:
 * 1) List - фактически динамический массив, основная реализация ArrayList
 * 2) Set - множество, основная реализация HashSet
 * 3) Map - ассоциативный массив, основная реализация HashMap
 */
public class ListExample {
    public static void main(String[] args) {
        /**
         * <> - называются diamonds, в них указывается тип данных коллекции
         * справа указывать тип данных необязательно, компилятор смотрит в левую часть и сам понимает, какой тип данных использовать
         *
         * Основные методы:
         * 1) add(Object object) - добавляет элемент в список
         * 2) remove(Object object) - удаляет элемент из списка
         * 3) remove(int index) - удаляет элемент по индексу
         * 4) get(int index) - находит элемент по индексу
         * 5) size() - возвращает размер списка
         * 6) contains(Object object) - проверяет, содержится ли элемент в списке
         * 7) isEmpty() - проверяет список на пустоту
         */
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello"); // 0
        stringList.add("World"); // 1
        stringList.add("From Russia"); // 2

        System.out.println(stringList);
        boolean remove = stringList.remove("From Russia");
        System.out.println(stringList);

        System.out.println("isEmpty: " + stringList.isEmpty());
        System.out.println("size: " + stringList.size());
    }
}
