package com.oops_exercises.Abstraction.DeliverySystem;

public class DeliveryMan {
    static void main() {
        Delivery ref1=new BikeDelivery("Modiji", 1123456);
        Delivery ref2=new DroneDelivery(15, 1124456);
        ref1.deliveryOrder();
        ref2.deliveryOrder();
    }
}
