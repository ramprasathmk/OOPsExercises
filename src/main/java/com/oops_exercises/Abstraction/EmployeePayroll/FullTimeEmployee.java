package com.oops_exercises.Abstraction.EmployeePayroll;

public class FullTimeEmployee extends Employee {
    double monthlyPay;
    FullTimeEmployee() {}
    FullTimeEmployee(double monthlyPay, String name, int id) {
        super(name, id);
        this.monthlyPay=monthlyPay;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Emp Id: "+id);
        System.out.println("Emp Name: "+name);
        System.out.println("Monthly Salary: "+monthlyPay);
        System.out.println("---------------------------------------");
    }
}
