package com.oops_exercises.Abstraction.PaymentSystem;

public class CreditCardPayment extends Payment{

    String cardNo;

    CreditCardPayment() {}

    CreditCardPayment(String cardNo, double amount) {
        super(amount);
        this.cardNo=cardNo;
    }

    @Override
    void pay() {
        System.out.println(amount+" sending to Account No: "+cardNo);
    }
}
