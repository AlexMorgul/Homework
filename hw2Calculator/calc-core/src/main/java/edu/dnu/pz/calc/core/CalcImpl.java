package edu.dnu.pz.calc.core;


import edu.dnu.pz.calc.interfaces.Calc;

/**
 * This is implementation of Calc

 */
public class CalcImpl implements Calc
{
    public double addition(double a, double b) { return a + b; }
    public double substraction(double a, double b) { return a - b; }
    public double multiplication(double a, double b) { return a * b; }
    public double division(double a, double b) {
        double tmp= 0;
        try {
            tmp= a / b;
        }
        catch (ArithmeticException e) { System.out.println("Division by zero"); tmp= 0; }
        return tmp;
    }
}
