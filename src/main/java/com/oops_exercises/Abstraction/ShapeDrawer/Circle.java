package com.oops_exercises.Abstraction.ShapeDrawer;

public class Circle extends Shape {
    double radius;
    Circle() {}
    Circle(double radius, String color) {
        super(color);
        this.radius=radius;
    }

    @Override
    public void draw() {
        System.out.println(color+" color Circle with radius: "+radius+" meters");
    }
}
