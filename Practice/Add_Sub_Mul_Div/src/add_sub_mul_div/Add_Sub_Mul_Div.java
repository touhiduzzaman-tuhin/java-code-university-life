
package add_sub_mul_div;

import java.util.Scanner;

public class Add_Sub_Mul_Div {

    
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = scr.nextInt();
        
        System.out.println("Enter another number: ");
        int b = scr.nextInt();
        
        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        int division = a / b;
        
        System.out.println("Addition: " +addition);
        System.out.println("Subtraction: " +subtraction);
        System.out.println("Multiplication: " +multiplication);
        System.out.println("Division: " +division);
    }
    
}
