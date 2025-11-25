package com.oops_exercises.Interface.User;

public class Customer implements User {
    private String address;

    Customer() {}

    Customer(String address) {
        this.address=address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address=address;
    }

    @Override public void access() {
        System.out.println("Customer has access to "+address);
    }
}
