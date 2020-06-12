package com.pravin.lede.gl.practice.company;

public class Employee {
    String name;
    double age;
    String designation;
    Education education;
    History history;

    public Employee(String name, double age, String designation, Education education, History history) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.education = education;
        this.history = history;
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public String getDesignation() {
        return designation;
    }

    public Education getEducation() {
        return education;
    }

    public History getHistory() {
        return history;
    }
}
