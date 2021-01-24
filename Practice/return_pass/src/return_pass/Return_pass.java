/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package return_pass;

/**
 *
 * @author Tuhin
 */
public class Return_pass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        sayHello("Tuhin");
        sayHello("Shama");
        sayHello("Sharmin");
        
        System.out.println("....................");
        
        add(123, 765, 876);
        add(187, 985, 453);
        add(988, 975, 734);
        
        System.out.println("....................");
        
        int sum = add_number(134, 887, 938);
        int result = sum * 53;
        
        System.out.println("Result is: " +result);
    }
    
    public static void sayHello(String name)
    {
        System.out.println("Hello " +name);
    }
    
    public static void add(int a, int b, int c)
    {
        System.out.println("Sum is: " +(a + b + c));
    }
    
    public static int add_number(int a, int b, int c)
    {
        return (a + b + c);
    }
}
