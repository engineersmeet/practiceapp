package com.pravin.lede.gl.mypracticeapp.utils;

public class SimpleInterest {

    double rateOfInterest;
    double years;
    double amount;

    public SimpleInterest(double rateOfInterest, double years, double amount) {
        this.rateOfInterest = rateOfInterest;
        this.years = years;
        this.amount = amount;
    }

    public double calculateSimpleInterest(){
        return (amount * years * rateOfInterest)/100;
    }

}
