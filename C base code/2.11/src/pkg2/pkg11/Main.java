/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.pkg11;

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
        
        System.out.println("Enter celsius value: ");
        
        double c = scan.nextDouble();
        
        double m = (double)9/5;
        
        double f = m * (c + 32);
        
        System.out.println("Farenheit value is: " +f);
        
    }
    
}
