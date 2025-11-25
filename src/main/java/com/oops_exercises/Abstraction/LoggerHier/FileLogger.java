package com.oops_exercises.Abstraction.LoggerHier;

public class FileLogger extends Logger {
    private String file;

    FileLogger() {}

    FileLogger(String file, String message) {
        super(message);
        this.file=file;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file=file;
    }

    @Override
    public void log() {
        System.out.println("Log Message: \""+getMessage()+"\" saved in "+file+" file.");
    }
}
