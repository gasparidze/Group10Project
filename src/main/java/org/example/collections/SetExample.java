package org.example.collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        /**
         * Set хранит только уникальные элементы
         * также есть методы по работе со множествами:
         * 1) addAll() - объединение 2х множеств
         * 2) retainAll() - пересечение 2х множеств
         * 3) removeAll() - исключение одного множества из другого
         *
         * Также у set нет метода get(), получить элементы можно только в цикле
         */
        Set<String> set = new HashSet<>();
        set.add("Hello");
        set.add("Hello");
        set.add("Hello");
        set.add("World");
        System.out.println(set);

        for (String s : set){
            System.out.println(s);
        }

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        initSets(set1, set2);

        System.out.println("Первое множество: " + set1);
        System.out.println("Второе множество: " + set2);

        set1.addAll(set2);
        System.out.println("Объединение 2х множеств: " + set1);

        initSets(set1, set2);
        set1.retainAll(set2);
        System.out.println("Пересечение 2х множеств: " + set1);

        initSets(set1, set2);
        set1.removeAll(set2);
        System.out.println("Разность из первого множества второе: " + set1);
    }

    private static void initSets(Set<Integer> set1, Set<Integer> set2){
        set1.clear();
        set2.clear();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        set2.add(3);
        set2.add(2);
        set2.add(6);
        set2.add(7);
        set2.add(8);
    }
}
