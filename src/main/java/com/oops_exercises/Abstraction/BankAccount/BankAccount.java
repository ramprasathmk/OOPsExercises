package com.oops_exercises.Abstraction.BankAccount;

abstract class BankAccount {
    private int accNo;

    private double balance;

    BankAccount() {}

    BankAccount(int accNo, double balance) {
        this.accNo=accNo;
        this.balance=balance;
    }

    public double getAccNo() {
        return accNo;
    }

    public void setAccNo(double balance) {
        this.balance=balance;
    }

    public double getBalance() {
        return  balance;
    }

    public void setBalance(double balance) {
        this.balance=balance;
    }

    abstract void deposit(double amount);

    abstract void withdraw(double amount);
}
