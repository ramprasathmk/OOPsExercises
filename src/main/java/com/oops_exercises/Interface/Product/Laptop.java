package com.oops_exercises.Interface.Product;

public class Laptop implements Product {
    private String processor;

    Laptop() {}

    Laptop(String processor) {
        this.processor=processor;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor=processor;
    }

    @Override
    public void details() {
        System.out.println("Laptop Price: "+price);
        System.out.println("Processor Name: "+processor);
        System.out.println("-----------------------------------");
    }
}
