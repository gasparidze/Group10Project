package org.example.animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals;

    public Zoo(){
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    public void removeAnimal(Animal animal){
        animals.remove(animal);
    }

    public void displayInfo(){
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    public void callMakeSound(){
        for (Animal animal : animals){
            animal.makeSound();
        }
    }
}
