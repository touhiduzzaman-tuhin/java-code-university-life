/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tuhin
 */
public class Person {
    protected String name;
    protected String address;
    protected String phone;
    protected String email;
    
    public Person()
    {
        
    }
    public Person(String n, String a, String p, String e)
    {
        this.name = n;
        this.address = a;
        this.phone = p;
        this.email = e;
    }
    @Override
    public String toString()
    {
        return "\nName: " +name+ "\nAddress: " +address+ "\nPhone: " +phone+ "\nEmail: " +email + "\n";
    }
}
