/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.pkg11;

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
        
        System.out.println("Enter your mark: ");
        
        int m = scan.nextInt();
        
        if(m >= 80)
        {
            System.out.println("A+");
        }
        
        else if(m >= 70)
        {
            System.out.println("A");
        }
        
        else if(m >= 60)
        {
            System.out.println("A-");
        }
        
        else if(m >= 50)
        {
            System.out.println("B");
        }
        
        else if(m >= 45)
        {
            System.out.println("C");
        }
        
        else if(m >= 33)
        {
            System.out.println("D");
        }
        
        else
        {
            System.out.println("Fail");
        }
    }
    
}
