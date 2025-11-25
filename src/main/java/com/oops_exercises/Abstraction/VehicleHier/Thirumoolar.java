package com.oops_exercises.Abstraction.VehicleHier;

public class Thirumoolar {
    static void main() {
        Vehicle ref1=new Car(4, "Tesla");
        Vehicle ref2=new Bike(5, "RX 100");
        ref1.start();
        ref2.start();
    }
}
