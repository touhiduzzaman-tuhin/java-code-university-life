/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.pkg3;

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
        
        System.out.println("Enter two number: ");
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        if(a > b)
        {
            System.out.println("The minimum number: " +b);
        }
        else
        {
             System.out.println("The minimum number: " +a);
        }
    }
    
}
