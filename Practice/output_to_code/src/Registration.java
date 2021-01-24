/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tuhin
 */
public class Registration {
    private String Semester;
    private int Year;
    
    public Registration(String s, int y)
    {
        this.Semester = s;
        this.Year = y;
    }
    
    public void display()
    {
        System.out.println("\nYear : " +Year + "\nSemester : " +Semester);
    }
}
