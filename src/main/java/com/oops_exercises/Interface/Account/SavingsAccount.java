package com.oops_exercises.Interface.Account;

public class SavingsAccount implements Account {
    private double interestRate;

    SavingsAccount() {}

    SavingsAccount(double interestRate) {
        this.interestRate=interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate=interestRate;
    }

    @Override
    public double calculate() {
        double updatedBalance = balance+(balance*interestRate/100);
        return updatedBalance;
    }
}
