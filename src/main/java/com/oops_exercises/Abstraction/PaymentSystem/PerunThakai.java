package com.oops_exercises.Abstraction.PaymentSystem;

public class PerunThakai {
    static void main() {
        Payment ref1=new CreditCardPayment("ABCD123456", 5000L);
        Payment ref2=new UPIPayment("987654321@upi", 6000L);
        ref1.pay();
        ref2.pay();
    }
}
