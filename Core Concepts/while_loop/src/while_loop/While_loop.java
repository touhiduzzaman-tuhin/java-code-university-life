/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package while_loop;

/**
 *
 * @author Tuhin
 */
import java.util.Scanner;

public class While_loop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int n = scan.nextInt();
        
        while(n <= 100)
        {
            System.out.println(n);
            n++;
        }
        
        System.out.println(".........................");
        
        System.out.println("Enter another number: ");
        int m = scan.nextInt();
        
        while(m >= 0)
        {
            System.out.println(m);
            m--;
        }
        
    }
    
}
/*
in while loop first cheak the condition then print and then increment the value
*/