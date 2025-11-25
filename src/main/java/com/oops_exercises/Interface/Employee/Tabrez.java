package com.oops_exercises.Interface.Employee;

public class Tabrez {
    static void main() {
        Employee dev=new Developer("Java Full Stack");
        Employee tes=new Tester("Selenium");
        dev.work();
        tes.work();
    }
}
