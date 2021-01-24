/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condition;

/**
 *
 * @author Tuhin
 */
import java.util.Scanner;

public class Condition {

    /*
    == ... equal to
    != ... not equal to
    > .... greater than
    < .... less than
    >= ... greater than equal
    <= ... less than eqaul
    */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a number number");
        int a = scan.nextInt();
        
        if(a % 2 == 0)
        {
            System.out.println("Even number");
        }
        else
        {
            System.out.println("Odd number");
        }
    }
    
}
