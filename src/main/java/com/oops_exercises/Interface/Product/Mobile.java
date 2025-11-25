package com.oops_exercises.Interface.Product;

public class Mobile implements Product {
    private int ram;

    Mobile() {}

    Mobile(int ram) {
        this.ram=ram;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram=ram;
    }

    @Override
    public void details() {
        System.out.println("Mobile Price: "+price);
        System.out.println("Ram Capacity: "+ram);
        System.out.println("-----------------------------------");
    }
}
