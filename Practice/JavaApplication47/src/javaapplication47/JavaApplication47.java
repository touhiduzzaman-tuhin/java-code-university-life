package javaapplication47;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

//package javaapplication47;

/**
 *
 * @author Tuhin
 */
public class JavaApplication47 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a, i;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        
        a = scan.nextInt();
        
        System.out.println("Your Times Table :");
        
        for(i = 1; i <= 10; i++)
        {
            System.out.println(a + "X" + i + "=" + a*i);
        }
        
    }
    
}
