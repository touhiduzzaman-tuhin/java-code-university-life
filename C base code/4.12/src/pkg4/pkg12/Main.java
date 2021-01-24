/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.pkg12;

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
        
        System.out.println("Enter a year: ");
        
        int a = scan.nextInt();
        
        if(a % 4 != 0)
        {
            System.out.println("Not leap year");
        }
        
        else if(a % 100 != 0)
        {
            System.out.println("Leap year");
        }
        
        else if(a % 400 != 0)
        {
            System.out.println("Not leap year");
        }
        
        else{
            System.out.println("Leap year");
        }
    }
    
}
