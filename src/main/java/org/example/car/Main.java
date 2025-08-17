package org.example.car;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        Car car = new Car(3);
        Truck truck = new Truck(10);
        Motorcycle motorcycle = new Motorcycle(true);
        vehicles[0] = car;
        vehicles[1] = truck;
        vehicles[2] = motorcycle;

        for (Vehicle vehicle : vehicles){
            vehicle.displayInfo();
        }

//        car.displayInfo();
//        truck.displayInfo();
//        motorcycle.displayInfo();
    }
}
