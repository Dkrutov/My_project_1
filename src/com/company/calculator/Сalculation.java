package com.company.calculator;

public class Сalculation {
    private double operand1;
    private double operand2;
    private double result;

    public double getOperand1() {
        return operand1;
    }

    public void setOperand1(double operand1) {
        this.operand1 = operand1;
    }

    public double getOperand2() {
        return operand2;
    }

    public void setOperand2(double operand2) {
        this.operand2 = operand2;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public double Addition (){
        result = operand1 + operand2;
        return result;
    }

    public double Subtraction (){
        result = operand1 - operand2;
        return result;
    }

    public double Multiplication (){
        result = operand1 * operand2;
        return result;
    }

    public double Division (){
        result = operand1 / operand2;
        return result;
    }
}
