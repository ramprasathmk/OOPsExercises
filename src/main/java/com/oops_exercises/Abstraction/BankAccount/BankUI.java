package com.oops_exercises.Abstraction.BankAccount;

public class BankUI {
    static void main() {
        BankAccount ref1=new SavingsAccount(1.5, 123456789, 5000);
        BankAccount ref2=new CurrentAccount(5000, 987654321, 55000);
        ref1.deposit(1000);
        ref1.withdraw(6000);
        System.out.println("-------------------------");
        ref2.deposit(5000);
        ref2.withdraw(60000);
    }
}
