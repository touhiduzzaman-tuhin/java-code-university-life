/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user_input;

/**
 *
 * @author Tuhin
 */
import java.util.Scanner;

public class User_input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Enter a integer number: ");
        int a = scan.nextInt();
        System.out.println("Number is:" +a);
        
        System.out.println("Enter a decimal number: ");
        double b = scan.nextDouble();
        System.out.println("Decimal Number is:" +b);
       
        /*System.out.println("Enter some charecter: ");
        String c = scan.nextLine();
        System.out.println("Text is:" +c);
        
        */
        //it is not posible to print int and char at one code
    }
    
}
