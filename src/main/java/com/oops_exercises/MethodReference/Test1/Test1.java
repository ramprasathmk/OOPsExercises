package com.oops_exercises.MethodReference.Test1;

public class Test1 {
    public static void display() {
        System.out.println("Tabrez is Here Nothing to Fear");
    }

    static void main() {
        Master ref1=Test1::display;
        ref1.speak();
    }
}
