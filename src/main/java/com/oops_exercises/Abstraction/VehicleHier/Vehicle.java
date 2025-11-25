package com.oops_exercises.Abstraction.VehicleHier;

abstract class Vehicle {
    String brand;
    Vehicle() {}
    Vehicle(String brand) {
        this.brand=brand;
    }
    abstract void start();
}
