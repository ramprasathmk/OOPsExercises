package com.oops_exercises.Interface.Order;

public class OfflineOrder implements Order {
    private String storeName;

    OfflineOrder() {}

    OfflineOrder(String storeName) {
        this.storeName=storeName;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName=storeName;
    }

    @Override
    public void process() {
        System.out.println("Payment done for Order Id "+orderId+" in the "+storeName);
    }
}
