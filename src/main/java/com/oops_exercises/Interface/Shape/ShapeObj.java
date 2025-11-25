package com.oops_exercises.Interface.Shape;

public class ShapeObj {
    static void main() {
        Shape circle=new Circle(7.0);
        Shape rectangle=new Rectangle(5.0, 4.0);
        System.out.println("Area of Circle is: "+circle.area()+"m.");
        System.out.println("Area of rectangle is: "+rectangle.area()+"m.");
    }
}
