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
        Mydate d = new Mydate(1,12,2016);
        Employee e = new Employee("Tuhin","Dhaka","01764937993","th@diu.edu.bd","DIU",35000);
        e.setHiredDate(d);
        System.out.println(e.toString());
        Student s = new Student("Tuhin","Dhaka","01764937993","th@diu.edu.bd");
        System.out.println(s.toString());
        Faculty f = new Faculty("Tuhin","Dhaka","01764937993","th@diu.edu.bd",34,"Head");
        System.out.println(f.toString());
        Stuff stf = new Stuff("Tuhin","Dhaka","01764937993","th@diu.edu.bd","Mr.");
        System.out.println(stf.toString());
    }
}
