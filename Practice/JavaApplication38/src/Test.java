/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tuhin
 */
public class Test {
    public static void main(String args[])
    {
        Customer c = new Customer("162-15-7727", "Tuhin");
        Item i = new Item("6754698", "Shampo", 12.50);
        
        c.Item(i);
        c.display();
    }
}
