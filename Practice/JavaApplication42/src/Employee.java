/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tuhin
 */
public class Employee extends Person {
    private String office;
    private int salary;
    private Mydate dateHired;
    
    public Employee(String n, String a, String p, String e, String o, int s)
    {
        super(n,a,p,e);
        
        this.office = o;
        this.salary = s;
    }
    
    public void setHiredDate(Mydate d)
    {
        this.dateHired = d;
    }
    
    public String toString()
    {
        return super.toString() + "\nOffice: " +office+ "\nSalary: " +salary + "\n"; 
               
    }
}
