/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constractor;

/**
 *
 * @author Tuhin
 */
public class Constractor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cube c1 = new Cube();
        
        System.out.println("Cube Area: " +c1.getCubeArea());
        
        Cube c2 = new Cube(10, 10, 10);
        
        System.out.println("Cube Area: " +c2.getCubeArea());
    }
    
}
