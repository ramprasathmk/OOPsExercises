package com.oops_exercises.Interface.Order;

public class OrderObjGen {
    static void main() {
        Order ref1=new OnlineOrder("BHIM");
        Order ref2=new OfflineOrder("Saravana Stores");
        ref1.process();
        ref2.process();
    }
}
