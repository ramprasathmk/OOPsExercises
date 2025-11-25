package com.oops_exercises.Abstraction.Logger;

public class LoggerApp {
    static void main() {
        Logger logApp=new FileLogger("../usr/log/file.log", "3");
        logApp.log();
    }
}
