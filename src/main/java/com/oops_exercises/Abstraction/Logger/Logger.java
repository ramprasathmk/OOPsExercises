package com.oops_exercises.Abstraction.Logger;

abstract class Logger {
    private String level;
    Logger() {}
    Logger(String level) {
        this.level=level;
    }
    public String getLevel() {
        return level;
    }
    public void setLevel(String level) {
        this.level=level;
    }
    abstract void log();
}
