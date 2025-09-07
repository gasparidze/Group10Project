package org.example.ordering;

public class Animal {
    public static int quantityOfAnimals = 10;
    private String name = "default name";

    static {
        System.out.println("вызов статического блока родителя");
    }
    public Animal(String name) {
        System.out.println("вызов конструктора родителя");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
