package com.oops_exercises.Interface.Animal;

public class Cat implements Animal {
    private String color;
    Cat() {}
    Cat(String color) {
        this.color=color;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public void eat() {
        System.out.println("Cat: "+name+" is in color "+color);
    }
}
