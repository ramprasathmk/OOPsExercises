package com.oops_exercises.Abstraction.Notification;

public class NotificationApp {
    static void main() {
        Notification app=new EmailNotification("tabrez@email.com", "Mission Successful");
        app.send();
    }
}
