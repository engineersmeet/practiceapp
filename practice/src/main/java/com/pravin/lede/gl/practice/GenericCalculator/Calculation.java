package com.pravin.lede.gl.practice.GenericCalculator;

public class Calculation {

    public static void main(String[] strings){

        System.out.println("Addition of Integer 10 + 10 = "+Calculator.add(10, 10));
        System.out.println("Addition of Double 10.0 + 10.0 = "+Calculator.add(10.0, 10.0));
        System.out.println("Addition of Float 10.0f + 10.0f = "+Calculator.add(10.0f, 10.f));

        System.out.println("Subtraction of Integer 10 - 5 = "+Calculator.subtract(10, 5));
        System.out.println("Subtraction of Double 10.0 - 5.0 = "+Calculator.subtract(10.0, 5.0));
        System.out.println("Subtraction of Float 10.0f - 5.0f = "+Calculator.subtract(10.0f, 5.0f));

        System.out.println("Multiplication of Integer 10 * 5 = "+Calculator.multiply(10, 5));
        System.out.println("Multiplication of Double 10.0 * 5.0 = "+Calculator.multiply(10.0, 5.0));
        System.out.println("Multiplication of Float 10.0f * 5.0f = "+Calculator.multiply(10.0f, 5.0f));

        System.out.println("Division of Integer 10 / 5 = "+Calculator.divide(10, 5));
        System.out.println("Division of Double 10.0 / 5.0 = "+Calculator.divide(10.0, 5.0));
        System.out.println("Division of Float 10.0f / 5.0f = "+Calculator.divide(10.0f, 5.0f));






    }
}
