/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39;

/**
 *
 * @author Tuhin
 * 
 */
import java.util.Scanner;

public class JavaApplication39 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a, b;
        Scanner scan = new Scanner(System.in);
        
        a = scan.nextInt();
        b = scan.nextInt();
        
        String str1 = Integer.toString(a + b);
        String str2 = Integer.toString(a);
        
        if(str1.length() == str2.length())
        {
            System.out.println(a+b);
        }
        else
        {
            System.out.println(a);
        }
        
    }
    
}
