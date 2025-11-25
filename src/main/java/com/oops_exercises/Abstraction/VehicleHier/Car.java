package com.oops_exercises.Abstraction.VehicleHier;

public class Car extends Vehicle {
    int doors;
    Car() {}
    Car(int doors, String brand) {
        super(brand);
        this.doors=doors;
    }

    @Override
    public void start() {
        System.out.println(brand+" car having "+doors+" doors");
    }
}
