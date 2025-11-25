package com.oops_exercises.Abstraction.VehicleHier;

public class Bike extends Vehicle {
    int gears;
    Bike() {}
    Bike(int gears, String brand) {
        super(brand);
        this.gears=gears;
    }

    @Override
    public void start() {
        System.out.println(brand+" bike having "+gears+" gears");
    }
}
