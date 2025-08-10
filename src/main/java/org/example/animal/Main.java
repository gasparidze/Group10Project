package org.example.animal;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        /**
         * все методы и поля унаследовались из класса-родителя
         */
        Tiger boris = new Tiger(80, "Africa", "borya sever", "uniqueParam");
        Lion alex = new Lion(100, "Africa", "alex msk", "orange");
        Monkey bananasik = new Monkey(40, "Africa", "bananasik krd", 10);

        /**
         * В целом, такая запись приемлема потому что Tiger, Lion и Monkey - наследники класса Animal
         *
         * Слева укзывается тип данных, справа - реализация этого типа данных
         * т.е. наш объект будет ограничен теми полями и методами, которые заданы в типе данных,
         * но если у нас есть методы, которые переопределяются в классе потомке, то будет браться реализация из класса-потомка
         */
        Animal ilya = new Tiger(84, "Africa", "ilya samara", "up");
        Animal simba = new Lion(120, "simba lion king", "simba usa", "orange");
        Animal bosonogiyMonkey = new Monkey(45, "Africa", "bosonogiy", 12);
//
//        ilya.saySmth();
//        simba.saySmth();
//        bosonogiyMonkey.saySmth();

        List<Animal> animals = List.of(ilya , simba , bosonogiyMonkey);

        for (Animal animal : animals) {
            say(animal);
        }
    }

    public static void say(Animal animal){
        /**
         * вот здесь и проявляется полиморфизм
         * полиморфный вызов метода saySmth()
         */
        animal.saySmth();
    }
}
