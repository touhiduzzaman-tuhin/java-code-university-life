/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_object;

/**
 *
 * @author Tuhin
 */
public class Class_object {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Student std1 = new Student();
        Student std2 = new Student();
        
        /*std.name = "Tuhin";
        std.id = "162-15-7727";
        std.age = 23;
        
        System.out.println("\nName : " +std.name+ "\nId: " +std.id+ "\nAge: "+std.age);*/
        
        std1.setId("162-15-7727");
        std1.setNmae("Tuhin");
        std1.setAge(23);
        
        std2.setId("162-15-0000");
        std2.setNmae("Shama");
        std2.setAge(22);
        
        System.out.println("\nID: " +std1.getId() + "\nNAME: " +std1.getName() + "\nAGE: " +std1.getAge());
        
        System.out.println("\nID: " +std2.getId() + "\nNAME: " +std2.getName() + "\nAGE: " +std2.getAge());
    }
    
}
