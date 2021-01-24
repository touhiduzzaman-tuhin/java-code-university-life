/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication51;

/**
 *
 * @author Tuhin
 */
import java.util.Scanner;
         
public class JavaApplication51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        
        a = scan.nextInt();
        
        switch(a)
        {
            case 1: 
                System.out.println("One");
            case 2: 
                System.out.println("Two");
            case 3: 
                System.out.println("Three");
            case 4: 
                System.out.println("Four");
            case 5: 
                System.out.println("Five");
            case 6: 
                System.out.println("Six");
            case 7: 
                System.out.println("Seven");
            case 8: 
                System.out.println("Eigth");
            case 9: 
                System.out.println("Nine");
            case 10: 
                System.out.println("Ten");
            default:
                System.out.println("Not find");
        }
    }
    
 }