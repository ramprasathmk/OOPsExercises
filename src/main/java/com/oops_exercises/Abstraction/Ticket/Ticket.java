package com.oops_exercises.Abstraction.Ticket;

abstract class Ticket {
    private double price;

    Ticket() {}

    Ticket(double price) {
        this.price=price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price=price;
    }

    abstract void book();
}
