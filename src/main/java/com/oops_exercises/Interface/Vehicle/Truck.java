package com.oops_exercises.Interface.Vehicle;

public class Truck implements Vehicle {
    private int capacity;

    Truck() {}

    Truck(int capacity) {
        this.capacity=capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity=capacity;
    }

    @Override public void move() {
        System.out.println(brand+" CyberTruck has "+capacity+"kg Capacity to Load.");
    }
}
