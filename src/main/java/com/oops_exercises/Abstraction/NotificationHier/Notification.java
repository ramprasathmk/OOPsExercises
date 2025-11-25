package com.oops_exercises.Abstraction.NotificationHier;

abstract class Notification {
    String message;
    Notification() {}
    Notification(String message) {
        this.message=message;
    }
    abstract void send();
}
