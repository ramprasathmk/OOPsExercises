package com.oops_exercises.Abstraction.ShapeDrawer;

public class Rectangle extends Shape {
    double width;
    double height;
    Rectangle() {}
    Rectangle(double width, double height, String color) {
        super(color);
        this.width=width;
        this.height=height;
    }

    @Override
    public void draw() {
        System.out.println(color+" color Rectangle with "+height+"x"+width+" meters");
    }
}
