/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tuhin
 */
public class Item {
    private String id;
    private String name;
    private double price;
    
    public Item()
    {
        
    }
    public Item(String id, String name, double price)
    {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    public void display()
    {
        System.out.println("ID: " +id+ "\n" + "Name: " +name+ "\n" + "Price: " +price+ "\n");
    }
    
}
