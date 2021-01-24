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

public class Student extends User {
    private String id;
    private String name;
    private double cgpa;
    
    private ArrayList<Course> course = new ArrayList();
    
    public Student( String u, String p,String id, String n, double c)
    {
        super(u, p);
        
        this.id = id;
        this.name = n;
        this.cgpa = c;
    }
    
    public void SetCgpa(double cg)
    {
        this.cgpa = cg;
    }
    
    public double GetCgpa()
    {
        return cgpa;
    }
    
    public void Take(Course i)
    {
        course.add(i);
    }
    
    public void display()
    {
        System.out.println("\nUser Id: " +id + "\nPassword: " +password + "\nStudent Id: " +id +"\nName: " +name +"\nCGPA: " +cgpa);
        
        for(Course course : course)
        {
            course.display();
        }
    }
}
