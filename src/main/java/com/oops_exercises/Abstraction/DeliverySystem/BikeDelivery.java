package com.oops_exercises.Abstraction.DeliverySystem;

public class BikeDelivery extends Delivery {
    private String riderName;

    BikeDelivery() {}

    BikeDelivery(String riderName, int orderId) {
        super(orderId);
        this.riderName=riderName;
    }

    public String getRiderName() {
        return riderName;
    }

    public void setRiderName(String riderName) {
        this.riderName=riderName;
    }

    @Override
    public void deliveryOrder() {
        System.out.println("Order Id "+orderId+" delivered by "+getRiderName());
    }
}
