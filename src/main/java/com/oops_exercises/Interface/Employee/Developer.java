package com.oops_exercises.Interface.Employee;

public class Developer implements Employee {
    private String skills;

    Developer() {}

    Developer(String skills) {
        this.skills=skills;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills=skills;
    }

    @Override
    public void work() {
        System.out.println("Developer "+empId+" developing the software with "+skills+" skills.");
    }
}
