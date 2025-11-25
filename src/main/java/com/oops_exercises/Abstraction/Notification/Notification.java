package com.oops_exercises.Abstraction.Notification;

abstract class Notification {
    String msg;
    Notification() {}
    Notification(String msg) {
        this.msg=msg;
    }
    abstract void send();
}
