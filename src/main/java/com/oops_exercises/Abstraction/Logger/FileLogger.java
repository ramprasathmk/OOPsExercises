package com.oops_exercises.Abstraction.Logger;

public class FileLogger extends Logger {
    private String path;

    FileLogger() {}

    FileLogger(String path, String level) {
        super(level);
        this.path=path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path=path;
    }

    @Override
    void log() {
        System.out.println("Log file is stored in "+path+" with level-"+getLevel());
    }
}
