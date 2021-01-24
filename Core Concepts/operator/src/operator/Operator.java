/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operator;

/**
 *
 * @author Tuhin
 */
import java.util.Scanner;

public class Operator {

    
    /*
    math operator => +, -, *, /, %
     System.out.println("Sumation is: " +sum);
    here we use +sum this + is concatation that means join
    */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Two number: ");
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;
        
        System.out.println("Sumation is: " +sum);
        System.out.println("Subtraction is: " +sub);
        System.out.println("Multiplication is: " +mul);
        System.out.println("Division is: " +div);
        System.out.println("Modulas is: " +mod);
    }
    
}
