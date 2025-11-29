package com.oops_exercises.ToString;

import java.util.Arrays;

class Student {
    int rollNo;
    String name;

    Student() {}

    Student(int rollNo, String name) {
        this.rollNo=rollNo;
        this.name=name;
    }

    @Override
    public String toString() {
        return rollNo+":"+name;
    }
}

public class StudentObjGen {
    public static void main(String[] args) {
        Student s1=new Student(10, "Kambar");
        Student s2=new Student(11, "Valluvar");
        Student s3=new Student(12, "Pugalenthi");
        Student[] students={s1, s2, s3};
        System.out.println(Arrays.toString(students));
    }
}
