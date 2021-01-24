/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication31;

/**
 *
 * @author Tuhin
 */

import java.util.Scanner;

public class JavaApplication31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("Tuhin");
        
        int a, b, c, d, e, f;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your two integer number: ");
        
        a = scan.nextInt();
        b = scan.nextInt();
        
        c = a + b;
        
        d = a - b;
        
        e = a * b;
        
        f = a / b;
        
        System.out.println("Sum is: " + c);
        System.out.println("Subtraction is: " + d);
        System.out.println("Multiplication is: " + e);
        System.out.println("Division is: " + f);
        
    }
    
}
