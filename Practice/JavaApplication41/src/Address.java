/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tuhin
 */
public class Address {
    private String city;
    private int road;
    private String district;
    
    public Address(String c, int r, String d)
    {
        this.city = c;
        this.road = r;
        this.district = d;
    }
    public void display()
    {
        System.out.println("City: " +city+ "\n" + "Road: " +road+ "\n" + "District: " +district+ "\n");
    }
    
}
