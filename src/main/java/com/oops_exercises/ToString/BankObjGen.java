package com.oops_exercises.ToString;

import java.util.Arrays;

class Bank {
    String name, branch;

    Bank() {}

    Bank(String name, String branch) {
        this.name=name;
        this.branch=branch;
    }

    @Override public String toString() {
        return name+":"+branch;
    }
}

public class BankObjGen {
    public static void main(String[] args) {
        Bank b1=new Bank("IcIcI", "Vadapalani");
        Bank b2=new Bank("Sbi", "Ashok Nagar");
        Bank b3=new Bank("HDFC", "Koyambedu");

        Bank[] banks={b1, b2, b3};
        System.out.println(Arrays.toString(banks));
    }
}
