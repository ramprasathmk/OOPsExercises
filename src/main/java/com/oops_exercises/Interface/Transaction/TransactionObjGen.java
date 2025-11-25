package com.oops_exercises.Interface.Transaction;

public class TransactionObjGen {
    static void main() {
        Transaction ref1=new CreditTxn(100000);
        Transaction ref2=new DebitTxn(100000);
        ref1.execute();
        ref2.execute();
    }
}
