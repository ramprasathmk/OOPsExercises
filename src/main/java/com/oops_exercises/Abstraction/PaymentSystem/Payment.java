package com.oops_exercises.Abstraction.PaymentSystem;

abstract class Payment {
    double amount;
    Payment() {}
    Payment(double amount) {
        this.amount=amount;
    }
    abstract void pay();
}
