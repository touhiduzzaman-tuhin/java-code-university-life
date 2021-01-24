/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tuhin
 */
public class Calculator {
    private double num1;
    public double num2;
    
    public Calculator(double num1, double num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public double add()
    {
        double result;
        result = num1 + num2;
        return result;
    }
    public void display()
    {System.out.println(add());

    }
}
