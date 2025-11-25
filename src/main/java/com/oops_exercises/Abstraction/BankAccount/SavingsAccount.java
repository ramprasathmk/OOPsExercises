package com.oops_exercises.Abstraction.BankAccount;

public class SavingsAccount extends BankAccount {
    private double interest;
    SavingsAccount() {}
    SavingsAccount(double interest, int accNo, double balance) {
        super(accNo, balance);
        this.interest=interest;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest( double interest) {
        this.interest=interest;
    }

    @Override
    public void deposit(double amount) {
        double balance = amount + (amount * interest / 100) + getBalance();
        setBalance(balance);
        System.out.println("Deposited: " + amount + ". New balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            double balance = getBalance()-amount;
            setBalance(balance);
            System.out.println("Withdrawn: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Insufficient Balance.");
        }
    }
}
