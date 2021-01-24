/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tuhin
 */
public class Student {
    private String id;
    private String name;
    private double cgpa;
    public Address a;
    
    public Student()
    {
        
    }
    public Student(String i, String n, double cg)
    {
        this.id = i;
        this.name = n;
        this.cgpa = cg;
    }
    
    public void updateAddress(Address add)
    {
        this.a = add;
    }
    
    public void display()
    {
        System.out.println("Id: " +id+ "\n" + "Name: " +name+ "\n" + "Cgpa: " +cgpa+ "\n" + "Address: " +a+ "\n");
    }
}
