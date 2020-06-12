package com.pravin.lede.gl.practice.company;

public class Education {
    String qualification;
    double marks;
    String date;

    public Education(String qualification, double marks, String date) {
        this.qualification = qualification;
        this.marks = marks;
        this.date = date;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
