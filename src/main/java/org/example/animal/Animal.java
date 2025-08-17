package org.example.animal;

/**
 * Наследование - это принцип ООП, согласно которому объект класса потомка может наследовать поведение (т.е. методы)
 * и состояния (т.е. свойства) базового класса (класса родителя). Это позволяет программусту создавать похожие объекты
 * без повторного переопределения характеристик.
 * наследование - это процесс, посредством которого один объект может приобретать свойства другого.
 *
 * Полиморфизм - это способность метода работать с данными разных типов.
 * Полиморфизм - некоторый прицнип, который позволяет одному и тому же фрагменту кода работать с разными типами данных.
 * Без наследования полиморфизм был бы невозможен.
 * Сушествует 2 типа полиморфизма:
 * 1) ad-hoc (мнимый) полиморфизм - это перегрузка методов
 * 2) параметрический (истинный) полиморфизмъ
 *
 * Абстракция означает разработку классов, исходя из их функциональности, не принимая во внимание реализацию деталей.
 * Абстрактный класс представляет из себя некий макет/чертеж без включения фактической реализации.
 * Нельзя создать объект абстрактного класса, т.к. это нелогично, т.е. нельзя создать какой-то конкретный объект чертежа/макета
 * Абстрактный класс без абстрактных методов может быть, но тогда он не имеет смысла
 */
public abstract class Animal {
    private double weight;
    private String environment;
    private String nickname;

    public Animal(double weight , String environment , String nickname) {
        this.weight = weight;
        this.environment = environment;
        this.nickname = nickname;
    }

    /**
     * Абстрактный метод не имеет реализации, на то он и абстракция
     */
    public abstract void saySmth();

    public abstract void makeSound();

    public abstract void eat();

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "weight=" + weight +
                ", environment='" + environment + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
