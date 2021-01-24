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

public class Customer extends User {
    private String name;
    private String phone;
    private String email;
    private Address ads;
    
    private ArrayList <Item> item = new ArrayList();
    
    public Customer(String uI, String pwd, String n, String p, String e)
    {
        super(uI, pwd);
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
        System.out.println("Name: " +name+ "\n" + "Phone: " +phone+ "\n" + "Email: " +email+ "\n");
        ads.display();
        
        for(Item  item : item)
        {
            item.display();
        }
    }
    
    public static void main(String args[])
    {
        Item i1 = new Item("15-28-7", "Pen", 5.40);
        Item i2 = new Item("17-19-9", "Book", 12.70);
        Item i3 = new Item("12-42-9", "Key", 56.90);
        Address a = new Address("Mirpur", 11, "Dhaka");
        Customer c = new Customer("Tuhin5084", "Tuuhin5084", "Tuhin", "01764937993", "touhiduzzamantuhin95@gmail.com");
        
        c.setAddress(a);
        c.buy(i1);
        c.buy(i2);
        c.buy(i3);
        c.display();
    }
    
}
