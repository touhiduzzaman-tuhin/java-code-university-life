/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.pkg12;

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
        
        System.out.println("Enter Farenheit value: ");
        
        double f = scan.nextDouble();
        
        double m = (double)5/9;
        
        double c = m * (f - 32);
        
        System.out.println("Celsius value is: " +c);
    }
    
}
