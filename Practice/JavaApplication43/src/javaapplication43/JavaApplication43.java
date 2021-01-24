/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication43;

/**
 *
 * @author Tuhin
 */
import java.util.Scanner;

public class JavaApplication43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello world!!!!!");
        
        /*int a, b, c;
        a = 5;
        b = 6;
        c = a + b;
        System.out.println(+c);*/
        
        /*int a = 5;
        int b = 6;
        int c = a + b;
        
        System.out.println(+c);*/
        
        int a , b, c;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        a = scan.nextInt();
        
        System.out.println("Enter another number: ");
        b = scan.nextInt();
        
        System.out.println( a + b);
        System.out.println( a - b);
        System.out.println( a * b);
        System.out.println( a / b);
        
        
    }
    
}
