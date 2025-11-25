package com.oops_exercises.Abstraction.Animals;

abstract class Animal {
    private int age;
    Animal() {}
    Animal(int age) {
        this.age=age;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age=age;
    }
    abstract void sound();
}
