package org.example.test;

import java.util.Arrays;

public class TestClass {
    public static void main(String[] args) {
        /**
         * Типы данных:
         * 1) int, long - целочисленные типы данных
         * 2) float, double - вещественный тип данных
         * 3) String - строковый тип данных
         * 4) char - символьный тип данных (e.x: 'a', 'b', 'c')
         * 5) boolean - логический тип данных (принимает true или false)
         */

        /**
         * создаются через квадратные скобки
         * справа указывается кол-во значений в массиве
         * обращаемся к элементам массива по индексу
         * индексация начинается с нуля
         */
        String[] array = new String[3];
        System.out.println("массив изначально: " + Arrays.toString(array));
        array[0] = "Hello";
        array[1] = "World";
        array[2] = "From Russia";
        System.out.println("массив после инициализации: " + Arrays.toString(array));

        System.out.println(array[2]);
//        System.out.println(array[3]); // ArrayIndexOutOfBoundsException
    }
}
