package Anil.model;

public class Calculator {
    private double num1;
    private double num2;
    private double result;

    public void setNumbers(double n){
        num2 = num1;
        num1 = n;
    }
    public void add(){
        result = num1 + num2;
    }
    public void subtract(){
        result = num1 - num2;
    }
    public void multiply(){
        result = num1 * num2;
    }
    public void divide(){
        result = num1 / num2;
    }

    public double getResult(){
        return result;
    }
}
