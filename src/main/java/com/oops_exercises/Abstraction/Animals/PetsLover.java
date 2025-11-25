package com.oops_exercises.Abstraction.Animals;

public class PetsLover {
    static void main() {
        Animal dog=new Dog("Labrador", 12);
        Animal cat=new Cat("Orange", 10);
        dog.sound();
        cat.sound();
    }
}
