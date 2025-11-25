package com.oops_exercises.Abstraction.EmployeePayroll;

public class KingPin {
    static void main() {
        Employee ref1=new FullTimeEmployee(500000L, "Games Gosling", 123456);
        Employee ref2=new PartTimeEmployee(500L, "Guido Van Rossum", 678901);
        ref1.calculateSalary();
        ref2.calculateSalary();
    }
}
