package com.oops_exercises.Abstraction.NotificationHier;

public class SMSNotification extends Notification {
    private String phone;
    SMSNotification() {}
    SMSNotification(String phone, String message) {
        super(message);
        this.phone=phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone=phone;
    }

    @Override
    public void send() {
        System.out.println("Sending Message \""+message+"\" To Phone "+getPhone());
    }
}
