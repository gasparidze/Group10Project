package org.example.equals_ex;

import java.util.Objects;

public class LuxuryAuto {
    private String model;
    private int manufactureYear;
    private int price;

    public LuxuryAuto(String model , int manufactureYear , int price) {
        this.model = model;
        this.manufactureYear = manufactureYear;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * this - это ссылка на объект, на котором вызывается equals()
     * o - это некоторый объект, который можем быть передан в equals
     * первые 2 проверки - базовые
     * 1) проверяем ссылки, что ссылка на наш объект и переданный объект одинаковые либо разные
     * 2) instanceof - это оператор (true/false), проверяет, что переданный объект нашего типа (LuxuryAuto)
     * 3) если прошли базовые проверки, то проверяем уже по полям
     *
     * При переопредлении equals() и hashCode() важно учитывать одни и те же поля
     */
    @Override
    public boolean equals(Object o) {
        /**
         * если ссылки равны => объекты равны(ссылки могут быть равны только у одного и того же объекта)
         */
        if (this == o) {
            return true;
        }
//        if (o == null || getClass() != o.getClass()){
//            return false;
//        }
        /**
         * false == false -> true
         * true == true -> true
         * false == true -> false
         * true == false -> false
         *
         * если типы объектов разные => объекты не могут быть равны
         */
        if (!(o instanceof LuxuryAuto that)) {
            return false;
        }
        /**
         * если базовые проверки пройдены, то переходим к проверки по полям
         */
        return manufactureYear == that.manufactureYear && price == that.price;
    }

    /**
     * ferrariGto ferrariGto
     *   152     152
     *     equals() == true
     *     объекты равны
     *
     * ferrariGto ferrariSpider
     *   152        153
     *    объекты не равны
     */
    /**
     * Хеш-функция, которая представлена в java методом hashCode(), возвращает числовое значение фиксированной длины
     * hashCode возвращает для любого объекта 32-битное число типа int
     *
     * Сравнивать два числа между собой - гораздо быстрее, чем сравнивать два объекта с помощью equals, особенно если
     * в нем используется много полей для сравнения
     *
     * Проще сравнить объекты по числу и только если они равны по этому числу переходить на сравнение по equals()
     *
     * Правила:
     * 1) 2 объекта, которые равны по equals() -> обязательно равны по hashCode()
     * 2) правило 1 не работает в обратную сторону:
     * 2 объекта логически (по полям) разных могут быть с одинаковым hashCode - такая ситуация называется коллизией
     * Коллизия имеет место быть, если плохо реализована хеш-функция
     *
     * 3) если метод hashCode вызывается несколько раз на одном и том же объекте, каждый раз он должен возвращать
     * одно и то же значение
     */
    @Override
    public int hashCode() {
        return Objects.hash(model, manufactureYear , price);
    }
}
