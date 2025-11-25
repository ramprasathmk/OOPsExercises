package com.oops_exercises.Interface.Account;

public class Trump {
    static void main() {
        Account ref1=new SavingsAccount(1.5);
        Account ref2=new CurrentAccount(10000);
        System.out.println(ref1.calculate());
        System.out.println(ref2.calculate());
    }
}
