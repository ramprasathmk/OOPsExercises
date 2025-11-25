package com.oops_exercises.Interface.Transaction;

public class CreditTxn implements Transaction {
    private double amount;

    CreditTxn() {}

    CreditTxn(double amount) {
        this.amount=amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount=amount;
    }

    @Override
    public void execute() {
        System.out.println("Rs "+amount+" Credited By Transaction Id "+txnId);
    }
}
