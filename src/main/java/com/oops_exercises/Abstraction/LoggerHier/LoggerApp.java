package com.oops_exercises.Abstraction.LoggerHier;

public class LoggerApp {
    static void main() {
        Logger fileLogger=new FileLogger("log.txt", "Server Started...");
        Logger consoleLogger=new ConsoleLogger("Debugging", "Test Case 3 Failed");
        fileLogger.log();
        System.out.println();
        consoleLogger.log();
    }
}
