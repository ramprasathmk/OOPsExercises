package com.oops_exercises.Interface.Animal;

public class AnimalObj {
    static void main() {
        Animal dog=new Dog("Labrador");
        Animal cat=new Cat("Brown");
        dog.eat();
        cat.eat();
    }
}
