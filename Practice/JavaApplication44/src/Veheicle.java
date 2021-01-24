/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tuhin
 */
public class Veheicle {
    private String color;
    
    public Veheicle(String c)
    {
        this.color = c;
    }
    
    public void display()
    {
        System.out.println("Color :" +color);
    }
}
