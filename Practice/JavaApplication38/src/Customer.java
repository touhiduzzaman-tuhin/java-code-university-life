/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tuhin
 */
//import java.util.ArrayList;

public class Customer {
    private String cid;
    private String cname;
    
    private Arraylist <Item> price = new Arraylist();
    
    public Customer()
    {
        
    }
    public Customer(String id, String name)
    {
        this.cid= id;
        this.cname = name;
    }
    public void display(Item it)
    {
        id.add(it);
    }
    
    public void display()
    {
        System.out.println("Customer info: " + "Id: " +cid+ "\n" + "Name: " +cname+ "\n");
        System.out.println("Bougth Item: ");
        for(Item item ; id)
            item.display();
    }
            
}
