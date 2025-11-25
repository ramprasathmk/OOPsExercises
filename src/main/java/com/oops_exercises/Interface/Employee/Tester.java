package com.oops_exercises.Interface.Employee;

public class Tester implements Employee {
    private String tools;

    Tester() {}

    Tester(String tools) {
        this.tools=tools;
    }

    public String getTools() {
        return tools;
    }

    public void setTools(String tools) {
        this.tools=tools;
    }

    @Override
    public void work() {
        System.out.println("Tester "+empId+" testing the software with "+tools);
    }
}
