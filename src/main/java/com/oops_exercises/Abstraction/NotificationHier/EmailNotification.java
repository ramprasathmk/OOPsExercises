package com.oops_exercises.Abstraction.NotificationHier;

public class EmailNotification extends Notification {
    private String emailId;
    EmailNotification() {}
    EmailNotification(String emailId, String message) {
        super(message);
        this.emailId=emailId;
    }

    // Getter
    public String getEmailId() {
        return emailId;
    }
    // Setter
    public void setEmailId(String emailId) {
        this.emailId=emailId;
    }

    @Override
    public void send() {
        System.out.println("Sending Message \""+message+"\" To Email "+getEmailId());
    }
}
