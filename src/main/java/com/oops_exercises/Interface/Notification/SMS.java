package com.oops_exercises.Interface.Notification;

public class SMS implements Notification {
    private String mobile;

    SMS() {}

    SMS(String mobile) {
        this.mobile=mobile;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile=mobile;
    }

    @Override public void send() {
        System.out.println(msg+" From "+mobile);
    }
}
