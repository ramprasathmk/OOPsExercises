package com.oops_exercises.Interface.Order;

public class OnlineOrder implements Order {
    private String paymentMode;

    OnlineOrder() {}

    OnlineOrder(String paymentMode) {
        this.paymentMode=paymentMode;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode=paymentMode;
    }

    @Override
    public void process() {
        System.out.println(paymentMode+" payment done for Order Id: "+orderId);
    }
}
