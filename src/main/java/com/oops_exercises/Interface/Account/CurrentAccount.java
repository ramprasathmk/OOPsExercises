package com.oops_exercises.Interface.Account;

public class CurrentAccount implements Account {
    private double limit;
    CurrentAccount() {}
    CurrentAccount(double limit) {
        this.limit=limit;
    }
    public double getLimit() {
        return limit;
    }
    public void setLimit(double limit) {
        this.limit=limit;
    }

    @Override
    public double calculate() {
        if (limit < balance) {
            return balance-limit;
        }
        return balance;
    }
}
