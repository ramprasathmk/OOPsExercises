package com.oops_exercises.Abstraction.Vehicle;

public class Car extends Vehicle {
    String model;

    Car() {}

    Car(String model, int speed) {
        super(speed);
        this.model=model;
    }

    public void start() {
        System.out.println(model+" running at speed "+speed+"km/hr");
    }
}
