package org.example.car;

public class Truck extends Vehicle{
    private int cargoCapacity;

    public Truck(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("truck is on road");
    }
}
