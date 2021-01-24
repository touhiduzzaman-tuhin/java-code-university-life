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
    private int houseNo;
    private int roadNo;
    private String road;
    private String city;
    
    public Address()
    {
        
    }
    public Address(int hN, int rN, String r, String c)
    {
        this.houseNo = hN;
        this.roadNo = rN;
        this.road = r;
        this.city = c;
    }
    
    public void display()
    {
        System.out.println("House No: " +houseNo+ "\n" + "Road No: " +roadNo+ "\n" + "Road: " +road+ "\n" + "City: " +city+ "\n");
    }
}
