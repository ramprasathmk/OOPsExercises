package com.oops_exercises.Abstraction.LoggerHier;

public class ConsoleLogger extends Logger {
    private String type;

    ConsoleLogger() {}

    ConsoleLogger(String type, String message) {
        super(message);
        this.type=type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type=type;
    }

    @Override
    public void log() {
        System.out.println("Got Console Error Message \""+getMessage()+" From "+type+" Type.");
    }
}
