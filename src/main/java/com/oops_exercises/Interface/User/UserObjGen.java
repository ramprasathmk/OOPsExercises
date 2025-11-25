package com.oops_exercises.Interface.User;

public class UserObjGen {
    static void main() {
        User ref1=new Admin("Admin");
        User ref2=new Customer("Chennai");
        ref1.access();
        ref2.access();
    }
}
