package com.oops_exercises.Abstraction.NotificationHier;

public class App {
    static void main() {
        Notification app1=new EmailNotification("irrumporai@cholanmail.com", "Defeated King Ashoka");
        Notification app2=new SMSNotification("9988776655", "Happy Birthday");
        app1.send();
        app2.send();
    }
}
