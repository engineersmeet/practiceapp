package com.pravin.lede.gl.practice;

public class CompoundInterest extends SimpleInterest {

    CompoundInterest(double rateOfInterest, double years, double amount) {
        super(rateOfInterest, years, amount);
    }

    double calculateCompoundInterest(){
        return amount * Math.pow(1.0+rateOfInterest/100.0,years) - amount;
    }

}
