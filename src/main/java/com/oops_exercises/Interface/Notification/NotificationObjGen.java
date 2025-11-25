package com.oops_exercises.Interface.Notification;

public class NotificationObjGen {
    static void main() {
        Notification ref1=new SMS("9988776655");
        Notification ref2=new Email("myemail@email.com");
        ref1.send();
        ref2.send();
    }
}
