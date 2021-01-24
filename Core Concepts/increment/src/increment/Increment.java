/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package increment;

/**
 *
 * @author Tuhin
 */
import java.util.Scanner;

public class Increment {

    /**
     * @param args the command line arguments
     */
    /*
    sum += 6;
    that means sum = sum + 5;
    in preorder first calculate the sum then print the result
    but in postorder first print the result then calculate the sum
    */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        
        a++;
        System.out.println(a);
        
        int b = scan.nextInt();
        
        System.out.println(b++);
        
        int c = scan.nextInt();
        
        System.out.println(++c);
        
        int d = scan.nextInt();
        
        d += 5;
        
        System.out.println(d);
        
        d -= 5;
        
        System.out.println(d);
        
        d *= 5;
        
        System.out.println(d);
        
        d /= 5;
        
        System.out.println(d);
        
        d %= 5;
        
        System.out.println(d);
    }
    
}
