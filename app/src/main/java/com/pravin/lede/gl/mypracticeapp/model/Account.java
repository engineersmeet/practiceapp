package com.pravin.lede.gl.mypracticeapp.model;

public class Account {

    double rateOfInterest;
    double years;
    double amount;

    public Account(double rateOfInterest, double years, double amount) {
        this.rateOfInterest = rateOfInterest;
        this.years = years;
        this.amount = amount;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public double getYears() {
        return years;
    }

    public double getAmount() {
        return amount;
    }
}
