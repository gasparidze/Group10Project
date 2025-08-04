package org.example.oop;

public class Main {
    public static void main(String[] args) {
        /**
         * Я создал объект/экземпляр класса Human
         *
         * поля и методы у объекта вызываются через точку
         *
         * слева мы прописываем тип данных (Human) и название переменной (artur, kseniya, polina)
         * справа мы создаем объект с помощью ключевого слова new
         * new - говорит компилятору, что нужно выделить некоторую область памяти в оперативке под новый объект
         */
//        Human artur = new Human();
//        artur.name = "Artur";
//        artur.weight = 72.2;
//        artur.height = 181;
//        artur.age = 26;
//        artur.sayHello(artur.name);
//
//        Human kseniya = new Human();
//        kseniya.name = "Kseniya";
//        kseniya.height = 170;
//        kseniya.age = 27;
//        kseniya.weight = 60.0;
//        kseniya.sayHello(kseniya.name);
//
//        Human polina = new Human();
//        polina.name = "Polina";
//        polina.weight = 56;
//        polina.height = 175;
//        polina.age = 20;
//        polina.sayHello(polina.name);

//        int function = function(1);
//        System.out.println(function);
//        System.out.println(function(2));

        Human artur = new Human("Artur", 72.2, 181, 26);

        Human kseniya = new Human("Kseniya", 170, 27, 60);

        Human polina = new Human("Polina",  175,56, 20);

        Human katya = new Human();

        Human vasya = new Human("Vasya");
    }

    /**
     *
     * y = 2*x;
     * x = 1, y = 2;
     * x = 2, y = 4;
     */
    public static int function(int x){
        return 2 * x;
    }
}
