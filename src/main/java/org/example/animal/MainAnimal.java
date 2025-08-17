package org.example.animal;

public class MainAnimal {
    public static void main(String[] args) {
        Tiger boris = new Tiger(80, "Africa", "borya sever", "uniqueParam");
        Lion alex = new Lion(100, "Africa", "alex msk", "orange");
        Monkey bananasik = new Monkey(40, "Africa", "bananasik krd", 10);

        Zoo zoo = new Zoo();
        zoo.addAnimal(boris);
        zoo.addAnimal(alex);
        zoo.addAnimal(bananasik);

        zoo.displayInfo();
        zoo.callMakeSound();
    }
}
