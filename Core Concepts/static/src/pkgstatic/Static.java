/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgstatic;

/**
 *
 * @author Tuhin
 */
public class Static {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hello h1 = new Hello();
        
        Hello.tuhin("tuhin");
        h1.tuhin1("vshg");
       // Hello.tuhin1("Rana");
       
       Hello h2 = new Hello();
       h2.age = 10;
       System.out.println(h2.age);
       
       
    }
    
}
