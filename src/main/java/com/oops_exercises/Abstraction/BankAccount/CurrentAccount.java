package com.oops_exercises.Abstraction.BankAccount;

public class CurrentAccount extends BankAccount {
    private double overdraft;

    CurrentAccount() {}

    CurrentAccount(double overdraft, int accNo, double balance) {
        super(accNo, balance);
        this.overdraft=overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft=overdraft;
    }

    @Override
    public void deposit(double amount) {
        double balance = getBalance()+amount;
        System.out.println("Deposited: " + amount + ". New balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount<= getBalance()+overdraft) {
            double balance = getBalance()-amount;
            setBalance(balance);
            System.out.println("Withdrawn: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }
}
