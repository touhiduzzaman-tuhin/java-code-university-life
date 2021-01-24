/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication32;

/**
 *
 * @author Tuhin
 */
import java.util.Scanner;

public class JavaApplication32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a, i;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        
        a = scan.nextInt();
        
        System.out.println("Your number is :" + a);
        
        for(i = 0; i < a; i++)
        {
            System.out.println(+i);
        }
    }
    
}
