/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.pkg6;

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
        
        System.out.println("Enter two integer: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int mod;
        mod = a % b;
           
        System.out.println("Modulas is :" +mod);
                
    }
    
}
