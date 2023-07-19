package com.company.lessons_oop.study_center.persons;

import com.company.lessons_oop.study_center.Program;

public class Student extends Person {
    private Program studentProgram;

    public Student(String name, String surName) {
        super(name, surName);
    }

    public Program getStudentProgram() {
        return studentProgram;
    }

    public void setStudentProgram(Program studentProgram) {
        this.studentProgram = studentProgram;
    }
}
