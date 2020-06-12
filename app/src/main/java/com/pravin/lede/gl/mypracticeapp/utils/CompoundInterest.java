package com.pravin.lede.gl.mypracticeapp.utils;

public class CompoundInterest extends SimpleInterest {

    public CompoundInterest(double rateOfInterest, double years, double amount) {
        super(rateOfInterest, years, amount);
    }

    public double calculateCompoundInterest(){
        return amount * Math.pow(1.0+rateOfInterest/100.0,years) - amount;
    }

}
