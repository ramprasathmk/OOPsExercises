package com.oops_exercises.Interface.Transaction;

public class DebitTxn implements Transaction {
    private double amount;

    DebitTxn() {}

    DebitTxn(double amount) {
        this.amount=amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount=amount;
    }

    @Override public void execute() {
        System.out.println("Rs "+amount+" Debited By Transaction Id: "+txnId);
    }
}
