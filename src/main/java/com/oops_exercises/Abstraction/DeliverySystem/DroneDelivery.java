package com.oops_exercises.Abstraction.DeliverySystem;

public class DroneDelivery extends Delivery {
    private int altitude;

    DroneDelivery() {}

    DroneDelivery(int altitude, int orderId) {
        super(orderId);
        this.altitude=altitude;
    }

    public int getAltitude() {
        return altitude;
    }
    public void setAltitude(int altitude) {
        this.altitude=altitude;
    }

    @Override
    public void deliveryOrder() {
        System.out.println("Order Id "+orderId+" delivered to "+altitude+" degrees Altitude");
    }
}
