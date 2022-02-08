package com.example.demo;

public class Calculator {

    public double add(double num[]){
        double returnVal = 0;
        for (int i = 0;i< num.length;i++){
            returnVal = returnVal + num[i];
        }
        return returnVal;
    }

    public double minus(double num[]){
        double returnVal = 0;
        for (int i = 0;i<num.length;i++){
            returnVal = returnVal - num[i];
        }
        return returnVal;
    }

    public double multiply(double num[]){
        double returnVal = 1;
        for (int i = 0;i<num.length;i++){
            returnVal = returnVal * num[i];
        }
        return returnVal;
    }

    public double divide(double num[]){
        double returnVal = 1;
        for (int i = 0;i<num.length;i++){
            returnVal = returnVal / num[i];
        }
        return returnVal;
    }
}
