package org.example.car;

public class Motorcycle extends Vehicle{
    private boolean hasSideCar;

    public Motorcycle(boolean hasSideCar) {
        this.hasSideCar = hasSideCar;
    }

    @Override
    public void displayInfo() {
        System.out.println("Motorcycle is on the road");
    }
}
