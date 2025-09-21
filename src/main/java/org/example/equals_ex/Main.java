package org.example.equals_ex;

public class Main {
    public static void main(String[] args) {
        LuxuryAuto ferrariGto = new LuxuryAuto("ferrari gto", 1963, 700000);
        LuxuryAuto ferrariSpider = new LuxuryAuto("ferrari spider", 1963, 700000);

        System.out.println("ferrariGto: " + ferrariGto);
        System.out.println("ferrariSpider: " + ferrariSpider);

        /**
         * знак двойного ровно сравнивает объекты по ссылке
         * но что если нам их надо сравнить логически по полям?
         * тогда необходимо использовать equals
         * equals - сравнивает два объекта логически (по полям)
         */
        System.out.println(ferrariGto == ferrariSpider);

        System.out.println("ferrariGto hashCode: " + ferrariGto.hashCode());
        System.out.println("ferrariSpider hashCode: " + ferrariSpider.hashCode());

        System.out.println(ferrariGto.equals(ferrariSpider));


    }
}
