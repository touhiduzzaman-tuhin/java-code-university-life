/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication49;

/**
 *
 * @author Tuhin
 */
import java.util.Scanner;

public class JavaApplication49 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, i, m, count = 0;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        
        n = scan.nextInt();
        
        m = n / 2;
        
        for(i = 2; i < m; i++)
        {
            if(n % i == 0)
            {
                //System.out.println("The number is not prime");
                count++;
                break;
            }
            /*else
            {
                System.out.println("The number is prime");
            }*/
        }
        if(count == 0)
        {
            System.out.println("The number is prime");
        }
        else
        {
            System.out.println("The number is not prime");
        }
    }
    
}
