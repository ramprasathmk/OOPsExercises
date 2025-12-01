package com.oops_exercises.Interface.Vehicle;

public class Car implements Vehicle {
    private int seat;

    Car() {}

    Car(int seat) {
        this.seat=seat;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat=seat;
    }

    @Override
    public void move() {
        System.out.println(brand+" Car has "+seat+" seats.");
    }
}
