/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.pkg6;

/**
 *
 * @author Tuhin
 */
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter three number: ");
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        if(a > b)
        {
            if(a > c)
            {
                System.out.println("The maximum number: " +a);
            }
            else
            {
                System.out.println("The maximum number: " +c);
            }
        
        }
        else
        {
            if(b > c)
            {
                System.out.println("The maximum number: " +b);
            }
            else
            {
                System.out.println("The maximum number: " +c);
            }
        }
    }
    
}
