package com.oops_exercises.Abstraction.EmployeePayroll;

abstract class Employee {
    String name;
    int id;
    Employee() {}
    Employee(String name, int id) {
        this.name=name;
        this.id=id;
    }
    abstract void calculateSalary();
}
