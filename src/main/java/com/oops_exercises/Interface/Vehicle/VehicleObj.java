package com.oops_exercises.Interface.Vehicle;

public class VehicleObj {
    static void main() {
        Vehicle car=new Car(4);
        Vehicle truck=new Truck(200);
        car.move();
        truck.move();
    }
}
