package org.example.car;

public class Car extends Vehicle{
    private int numDoors;

    public Car(int numDoors) {
        this.numDoors = numDoors;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car is on the road");
    }
}
