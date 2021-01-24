/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package access_modifier;

/**
 *
 * @author Tuhin
 */
public class Access_modifier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Student std = new Student();
        std.name = "Tuhin";
        std.age = 24;
        System.out.println("Age: " + std.age + "\n" +"Name: "  +std.name);
        
        Student std1 = new Student();
        std1.setEmail("tuhin@jghg.hu");
        System.out.println(std1.getEmail());
    }
    
}
