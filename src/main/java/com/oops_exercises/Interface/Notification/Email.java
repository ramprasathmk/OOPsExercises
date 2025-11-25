package com.oops_exercises.Interface.Notification;

public class Email implements Notification {
    private String email;

    Email() {}

    Email(String email) {
        this.email=email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email=email;
    }

    @Override
    public void send() {
        System.out.println(msg+" From "+email);
    }
}
