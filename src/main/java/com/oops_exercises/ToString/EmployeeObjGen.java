package com.oops_exercises.ToString;

import java.util.Arrays;

class Employee {
    int empId;
    String empName;

    Employee() {}

    Employee(int empId, String empName) {
        this.empId=empId;
        this.empName=empName;
    }

    @Override
    public String toString() {
        return empId+":"+empName;
    }
}

public class EmployeeObjGen {
    public static void main(String[] args) {
        Employee emp1=new Employee(101, "Kiran");
        Employee emp2=new Employee(102, "Paari");
        Employee emp3=new Employee(103, "Varun");
        Employee[] employees={emp1, emp2, emp3};
        System.out.println(Arrays.toString(employees));
    }
}
