package com.oops_exercises.Interface.Shape;

public class Circle implements Shape {
    private double radius;

    Circle() {}

    Circle(double radius) {
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius=radius;
    }

    @Override
    public double area() {
        return PI*radius*radius;
    }
}
