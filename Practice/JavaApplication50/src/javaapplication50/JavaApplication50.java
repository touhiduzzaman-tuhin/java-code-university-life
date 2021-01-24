/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication50;

/**
 *
 * @author Tuhin
 */
import java.util.Scanner;

public class JavaApplication50 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        
        a = scan.nextInt();
        
        if(a % 2 == 0)
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number is Odd");
        }
    }
    
}
