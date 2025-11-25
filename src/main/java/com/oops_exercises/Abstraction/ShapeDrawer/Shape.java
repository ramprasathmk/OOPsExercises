package com.oops_exercises.Abstraction.ShapeDrawer;

abstract class Shape {
    String color;
    Shape() {}
    Shape(String color) {
        this.color=color;
    }

    abstract void draw();
}
