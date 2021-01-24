/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_method1;

/**
 *
 * @author Tuhin
 */
public class Class_method1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student s = new Student();
        
        s.id = "162-15-7727";
        s.name = "Tuhin";
        s.age = 22;
        
        Student s1 = new Student();
        
        s1.id = "162-15-7720";
        s1.name = "Shama";
        s1.age = 21;
        
        System.out.println("\nId: " +s.id +"\nName: " +s.name + "\nAge: "+s.age);
        System.out.println("\nId: " +s1.id +"\nName: " +s1.name + "\nAge: "+s1.age);
        
        Student s2 = new Student();
        
        s2.setId("162-16-0000");
        s2.setName("Rana");
        s2.setAge(22);
        
        System.out.println("\nId: " +s2.getId()+"\nName: " +s2.getName() + "\nAge: "+s2.getAge());
    }
    
}
