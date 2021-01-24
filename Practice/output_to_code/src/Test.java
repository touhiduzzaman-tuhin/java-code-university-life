/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tuhin
 */
public class Test {
    public static void main(String[] args)
    {
        Course c1 = new Course ("CSE-411", "MATH-4", 3.00, "A");
        Course c2 = new Course ("CSE-412", "CIRCUIT-4", 3.00, "A");
        Course c3 = new Course ("CSE-413", "JAVA", 3.00, "A");
        
        Student s = new Student("Tuuhin","tuhintkase70", "162-15-7727", "Touhiduzzaman", 3.98);
        
        Registration r = new Registration("4th", 2);
        
        s.Take(c1);
        s.Take(c2);
        s.Take(c3);
        s.display();
        r.display();
    }
}
