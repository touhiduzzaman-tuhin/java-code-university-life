/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tuhin
 */
public class Customer {
    private String id;
    private String name;
    private String address;
    
    public Customer()
    {
        
    }
    public Customer(String id, String name, String address)
    {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public void display()
    {
        System.out.println("ID: " + id "NAME: " +name "ADDRESS: " +address);
    }
    public static void main(String[] args)
    {
        Customer c = new Customer("162-15-7727", "Tuhin", "Dhaka");
        c.display();
    }
}
