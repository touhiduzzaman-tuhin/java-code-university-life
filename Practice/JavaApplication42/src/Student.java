/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tuhin
 */
public class Student extends Person {
    private static final  String status = "Senior";
    
    public Student(String n, String a, String p, String e)
    {
        super(n,a,p,e);
    }
    public String toString()
    {
        return super.toString() + "Status: " +status + "\n";
    }
}
