package com.oops_exercises.Abstraction.Animals;

public class Dog extends Animal {
    private String breed;

    Dog() {}

    Dog(String breed, int age) {
        super(age);
        this.breed=breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed=breed;
    }

    @Override
    void sound() {
        System.out.println(breed+" Dog barks like Borf Borf! and is "+getAge()+" years old.");
    }
}
