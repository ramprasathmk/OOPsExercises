package com.oops_exercises.Abstraction.Notification;

public class EmailNotification extends Notification {
    String email;
    EmailNotification() {}
    EmailNotification(String email, String msg) {
        super(msg);
        this.email=email;
    }

    @Override
    public void send() {
        System.out.println("Message: "+msg+", sent to email "+email);
    }
}
