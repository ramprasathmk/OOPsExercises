package com.oops_exercises.Abstraction.DeliverySystem;

abstract class Delivery {
    int orderId;

    Delivery() {}

    Delivery(int orderId) {
        this.orderId=orderId;
    }

    abstract void deliveryOrder();
}
