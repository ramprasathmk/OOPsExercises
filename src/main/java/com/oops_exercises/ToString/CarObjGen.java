package com.oops_exercises.ToString;

import java.util.Arrays;

class Car {
    String model;
    double price;

    Car() {}

    Car(String model, double price) {
        this.model=model;
        this.price=price;
    }

    @Override
    public String toString() {
        return model+":"+price;
    }
}

public class CarObjGen {
    public static void main(String[] args) {
        Car c1=new Car("Alto", 500000.0);
        Car c2=new Car("Nexa", 600000.0);
        Car c3=new Car("Magnite", 740000.0);
        Car[] cars={c1, c2, c3};
        System.out.println(Arrays.toString(cars));
    }
}
