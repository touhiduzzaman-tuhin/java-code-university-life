/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tuhin
 */
public class Course {
    private String CourseCode;
    private String CourseName;
    private double Credit;
    private String Section;
    
    public Course(String c, String n, double cd, String s)
    {
        this.CourseCode = c;
        this.CourseName = n;
        this.Credit = cd;
        this.Section = s;
    }
    
    public void display()
    {
        System.out.println("\nCourse Code: " +CourseCode + "\nCourse Name: " +CourseName + "\nCredit: " +Credit + "\nSection: " +Section);
    }
}
