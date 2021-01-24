/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *
 * @author Tuhin
 */
public class Overloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(add(1,5));
        System.out.println(add(1.65,5.93));
        System.out.println(add("Tuh","in"));
    }
    public static int add(int a, int b)
    {
        return (a + b);
    }
    
    public static double add(double a, double b)
    {
        return (a + b);
    }
    public static String add(String a, String b)
    {
        return (a + b);
    }
}
