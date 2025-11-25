package com.oops_exercises.Abstraction.Vehicle;

abstract class Vehicle {
    int speed;
    Vehicle() {}
    Vehicle(int speed) {
        this.speed=speed;
    }
    abstract void start();
}