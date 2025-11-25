package com.oops_exercises.Abstraction.PaymentSystem;

public class UPIPayment extends Payment {

    String upiId;

    UPIPayment() {}

    UPIPayment(String upiId, double amount) {
        super(amount);
        this.upiId=upiId;
    }

    @Override
    public void pay() {
        System.out.println(amount+" sending to UPI Id: "+upiId);
    }
}
