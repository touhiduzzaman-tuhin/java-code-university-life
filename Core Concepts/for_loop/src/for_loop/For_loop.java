/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package for_loop;

/**
 *
 * @author Tuhin
 */
import java.util.Scanner;

public class For_loop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int a = scan.nextInt();
        
        System.out.println("The times table is");
        
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(a +" X "+ i +"= "+ (a*i));
        }
    }
    
}
