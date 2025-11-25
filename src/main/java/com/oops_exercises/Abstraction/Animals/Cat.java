package com.oops_exercises.Abstraction.Animals;

public class Cat extends Animal {
    private String color;

    Cat() {}

    Cat(String color, int age) {
        super(age);
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color=color;
    }

    @Override
    void sound() {
        System.out.println("My "+color+" Cat is "+getAge()+" years old.");
    }
}
