/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method_overloading;

/**
 *
 * @author Tuhin
 */
public class Method_overloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Add(1,2));
        System.out.println(Add(1.56, 2.98));
        System.out.println(Add("Tuhin","Shaama"));
        
    /**
     *
     * @param a
     * @param b
     * @return
     */
        public static int Add(int a, int b)
        {
            return (a + b);
        }
        
        public static double Add(double a, double b)
        {
            return (a + b);
        }
        
        public static String Add(String a, String b)
        {
            return (a + b);
        }
        
    }
    
}
