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
    
    public Item(String i, String n, double p)
    {
        this.id = i;
        this.name = n;
        this.price = p;
    }
    
    public void display()
    {
        System.out.println("Item Bougth: ");
        System.out.println("Id: " +id+ "\n" + "Name: " +name+ "\n" + "Price: " +price + "\n");
    }
}
