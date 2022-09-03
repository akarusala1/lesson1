package Anil.test;

import Anil.model.Calculator;

public class CalculaterTest {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.setNumbers(10);
        c.setNumbers(20);
        c.add();
        double result = c.getResult();
        System.out.println("Result : " + result);

        assert c.getResult() == 30;
    }
}
