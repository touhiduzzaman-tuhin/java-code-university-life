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
        Address ads = new Address(45, 11, "Dhanmondi", "Dhaka");
        Student std = new Student("162-15-7727", "Tuhin", 3.98);
        
        std.updateAddress(ads);
        //std.Address();
        std.display();
        
    }
}
