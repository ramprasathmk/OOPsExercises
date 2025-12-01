package com.oops_exercises.Interface.Animal;

public class Dog implements Animal {
    private String breed;

    Dog() {}

    Dog(String breed) {
        this.breed=breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed=breed;
    }

    @Override
    public void eat() {
        System.out.println("Dog: "+name+" is eating pedigree and breed of "+breed);
    }
}
