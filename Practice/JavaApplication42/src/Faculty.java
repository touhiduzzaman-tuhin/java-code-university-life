/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tuhin
 */
public class Faculty extends Employee{
    private int officeHour;
    private String rank;
    
    public Faculty(String n, String a, String p, String e, int ofh,String rk)
    {
        super(n,a,p,e,"XYZ",35000);
        
        this.officeHour = ofh;
        this.rank = rk;        
    }
    public String toString()
    {
        return super.toString() + "\nOffice Hour: " +officeHour+ "\nRank: " +rank + "\n"; 
    }
    
}
