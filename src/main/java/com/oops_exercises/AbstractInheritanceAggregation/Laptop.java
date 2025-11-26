package com.oops_exercises.AbstractInheritanceAggregation;

public class Laptop implements Product {
    private String processor;
    private String graphics;

    Laptop() {}

    Laptop(String processor, String graphics) {
        this.processor=processor;
        this.graphics=graphics;
    }

    public String getProcessor() {
        return processor;
    }

    public String getGraphics() {
        return graphics;
    }

    public void setProcessor(String processor) {
        this.processor=processor;
    }

    public void setGraphics(String graphics) {
        this.graphics=graphics;
    }

    @Override
    public void details() {
        System.out.print("Laptop Model: Notebook"+productId);
        System.out.print(" with Processor "+processor);
        System.out.println(" supports "+graphics+" Graphics Card.");
    }
}
