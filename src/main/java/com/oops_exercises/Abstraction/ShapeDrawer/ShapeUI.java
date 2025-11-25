package com.oops_exercises.Abstraction.ShapeDrawer;

public class ShapeUI {
    static void main() {
        Shape ref1=new Circle(27.0, "Red");
        Shape ref2=new Rectangle(10, 20, "Blue");
        ref1.draw();
        ref2.draw();
    }
}
