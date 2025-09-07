package org.example.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    /**
     * MSK -> UTC+3
     * SAM -> UTC+4
     * VL -> UTC+12
     */
    public static void main(String[] args) {
        /**
         * Мапа хранит в себе пары ключ=значение
         * String - тип данных ключа
         * Integer - тип данных значения
         *
         * Основные методы:
         * 1) put(key, value) - добавляет значение в мапу по ключу
         * 2) get(key) - получает значение по ключу
         * 3) containsKey(key) - проверяет, есть ли такой ключ в мапе
         * 4) keySet() - возвращает Set (множество) всех ключей в мапе
         * 5) values() - возвращает коллекцию всех значений в мапе
         * 6) entrySet() - возвращает множество всех пары (Map.Entry) ключ=значение
         * 7) isEmpty()
         * 8) size()
         */
        Map<String, Integer> map = new HashMap<>();
        map.put("MSK", 3);
        map.put("SAM", 4);
        map.put("VL", 12);
        System.out.println(map);

        Integer offsetMSK = map.get("MSK");
        System.out.println("get: " + offsetMSK);

        boolean isContain = map.containsKey("VL");
        System.out.println("is VL contain: " + isContain);

        Set<String> keySet = map.keySet();
        System.out.println("Множество всех ключей: " + keySet);

        Collection<Integer> values = map.values();
        System.out.println("Значения: " + values);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        int i = 0;
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Пара " + ++i + ": ключ=" + key + " значение=" + value);
        }
    }
}
