package com.oops_exercises.Interface.Shape;

public class Rectangle implements Shape {
    private double length, breadth;

    Rectangle() {}

    Rectangle(double length, double breadth) {
        this.length=length;
        this.breadth=breadth;
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setLength(double length) {
        this.length=length;
    }

    public void setBreadth(double breadth) {
        this.breadth=breadth;
    }

    @Override
    public double area() {
        return length*breadth;
    }
}
