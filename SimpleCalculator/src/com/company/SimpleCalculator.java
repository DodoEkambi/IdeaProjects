package com.company;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;
    public void setFirstNumber(double firstNumber){
        this.firstNumber=firstNumber;
    }
    public double getFirstNumber(){
        return this.firstNumber;
    }
    public void setSecondNumber(double secondNumber){
        this.secondNumber=secondNumber;
    }
    public double getSecondNumber(){
        return this.secondNumber;
    }
    public double getAdditionResult(){
        return getFirstNumber()+getSecondNumber();
    }
    public double getSubtractionResult(){
        return getFirstNumber()-getSecondNumber();
    }
    public double getMultiplicationResult(){
        double v = getFirstNumber() * getSecondNumber();
        return v;
    }
    public double getDivisionResult(){
        if(getSecondNumber()==0){
            return 0;
        }
        else
            return getFirstNumber()/getSecondNumber();

    }

}
