package com.oops_exercises.Abstraction.EmployeePayroll;

public class PartTimeEmployee extends Employee {
    double hourlyRate;
    PartTimeEmployee() {}
    PartTimeEmployee(double hourlyRate, String name, int id) {
        super(name, id);
        this.hourlyRate=hourlyRate;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Emp Id: "+id);
        System.out.println("Emp Name: "+name);
        System.out.println("Hourly Salary: "+hourlyRate);
        System.out.println("---------------------------------------");
    }
}
