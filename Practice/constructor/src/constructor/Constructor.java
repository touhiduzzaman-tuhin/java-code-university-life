/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author Tuhin
 */
public class Constructor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cube c1 = new Cube();       
        
        System.out.println("Cube :" +c1.getCubeVolume());
        
        Cube c2 = new Cube(20, 20, 20);  
        
        System.out.println("Cube :" +c2.getCubeVolume());
    }
    
}
