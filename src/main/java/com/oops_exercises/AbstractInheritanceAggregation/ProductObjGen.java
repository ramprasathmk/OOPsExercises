package com.oops_exercises.AbstractInheritanceAggregation;

public class ProductObjGen {
    static void main() {

        Sim sim=Sim.getSimObj("Jio", 5, 500000.0);

        Product ref1=new Laptop("Intel Core 5", "NVIDIA GTX 3050");
        Product ref2=new Mobile(12, sim);
        ref1.details();
        ref2.details();
    }
}
