package com.oops_exercises.Interface.User;

public class Admin implements User {
    private String role;

    Admin() {}

    Admin(String role) {
        this.role=role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role=role;
    }

    @Override
    public void access() {
        System.out.println(username+" has "+role);
    }
}
