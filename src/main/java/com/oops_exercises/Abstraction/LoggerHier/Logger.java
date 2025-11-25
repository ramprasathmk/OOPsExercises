package com.oops_exercises.Abstraction.LoggerHier;

abstract class Logger {
    private String message;

    Logger() {}

    Logger(String message) {
        this.message=message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message=message;
    }

    abstract void log();
}
