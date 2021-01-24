/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perametar_method;

/**
 *
 * @author Tuhin
 */
public class Perametar_method {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        tuhin("Shama");
        
        add(100, 654, 874);
        
        int sum = add2(123, 987, 745);
        
        int result = sum * 10;
        
        System.out.println("\nSum is: " +result);
    }
    
    public static void tuhin(String s)
    {
        System.out.println("\nHello " + s);
    }
    
    public static void add(int a, int b, int c)
    {
        System.out.println("\nSum is: " + (a + b + c));
    }
    
    public static int add2(int a, int b, int c)
    {
          return(a + b + c);
    }
}
