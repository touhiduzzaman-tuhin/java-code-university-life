/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication37;

/**
 *
 * @author Tuhin
 */
public class JavaApplication37 {

    /**
     * @param args the command line arguments
     */
    private String id;
    private String name;
    private String address;
    
    public JavaApplication37()
    {
        
    }
    public JavaApplication37(String id, String name, String address)
    {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public void display()
    {
        System.out.println("ID: " + id + "\n" + "NAME: " + name + "\n" + "ADDRESS: " + address+ "\n");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        JavaApplication37 c1 = new JavaApplication37("162-15-7727", "Tuhin", "Dhaka");
        JavaApplication37 c2 = new JavaApplication37("162-15-7000", "Shama", "Mirpur");
        c1.display();
        c2.display();
    }
    
}
