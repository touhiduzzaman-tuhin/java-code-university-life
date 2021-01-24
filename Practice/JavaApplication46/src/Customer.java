/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tuhin
 */
import java.util.ArrayList;

public class Customer extends Use {
    private String name;
    private String phone;
    private String email;
    private Address ads;
    
    private ArrayList <Item> item = new ArrayList();
    
    public Customer(String u, String pwd, String n, String p, String e)
    {
        super(u, pwd);
        this.name = n;
        this.phone = p;
        this.email = e;
        
    }
    
    public void setAddress(Address a)
    {
        this.ads = a;
    }
    
    public Address getAddress()
    {
        return ads;
    }
    
    public void buy(Item i)
    {
        item.add(i);
    }
    
    public void display()
    {
        System.out.println("Customer Details: ");
        System.out.println("Name : " +name+ "\n" + "Phone: " +phone+ "\n" + "Email: " +email+ "\n");
        ads.display();
        
        for(Item item : item)
        {
            item.display();
        }
    }
    
    public static void main(String args[])
    {
        Item i1 = new Item("123-22-34", "Gold Leaf", 8.00);
        Item i2 = new Item("125-02-45", "Condom", 25.00);
        Item i3 = new Item("153-34-23", "Drinks", 35.00);
        
        Customer c = new Customer("Tuhin", "tuhintkase70", "Touhiduzaman Tuhin",  "+88012345678", "touhiduzzamantuhin95@gmail.com");
        
        Address a = new Address("Dhanmondi", 58, "Dhaka");
        
        c.setAddress(a);
        c.buy(i1);
        c.buy(i2);
        c.buy(i3);
        c.display();
    }
}
