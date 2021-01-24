/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logical_operator;

/**
 *
 * @author Tuhin
 */
import java.util.Scanner;

public class Logical_operator {

    /*
    && ..... if all condition is true then print statement works
    || ......if only one condition is true then print statement wokrs
    */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a grade: ");
        
        int a = scan.nextInt();
        
        if(a >= 80 && a <= 100)
        {
            System.out.println("A");
        }
        if(a >= 60 || a <= 40)
        {
            System.out.println("B");
        }
    }
    
}
