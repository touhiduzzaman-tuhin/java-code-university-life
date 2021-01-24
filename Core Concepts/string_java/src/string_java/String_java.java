/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string_java;

/**
 *
 * @author Tuhin
 */
import java.util.Scanner;

public class String_java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        String c = scan.nextLine();
        
        System.out.println(c);
        
        int a = c.length();
        
        System.out.println(a);
        
        String l = c.toLowerCase();
        
        System.out.println(l);
        
        String u = c.toUpperCase();
        
        System.out.println(u);
        
        
        String r = c.replace('e', 'a');
        
        System.out.println(r);
        
    }
    
}
