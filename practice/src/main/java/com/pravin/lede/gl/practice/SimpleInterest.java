package com.pravin.lede.gl.practice;

public class SimpleInterest {

    double rateOfInterest;
    double years;
    double amount;

    SimpleInterest(double rateOfInterest, double years, double amount) {
        this.rateOfInterest = rateOfInterest;
        this.years = years;
        this.amount = amount;
    }

    double calculateSimpleInterest(){
        return (amount * years * rateOfInterest)/100;
    }

}
