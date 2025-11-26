package com.oops_exercises.AbstractInheritanceAggregation;

public class Mobile implements Product {
    private int ram;
    private Sim slot;

    Mobile() {}

    Mobile(int ram, Sim slot) {
        this.ram=ram;
        this.slot=slot;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram=ram;
    }

    public Sim getSlot() {
        return slot;
    }

    public void setSlot(Sim slot) {
        this.slot=slot;
    }

    @Override
    public void details() {
        System.out.print("Mobile Model: Foldable"+productId);
        System.out.print(" with "+ram+"GB RAM Capacity");
        System.out.print(" Supports up to "+slot.getBandWidth()+"G Sim Technology.");
    }
}
