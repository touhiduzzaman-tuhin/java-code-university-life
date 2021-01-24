/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constractor;

/**
 *
 * @author Tuhin
 */
public class Cube {
    int hight;
    int length;
    int breadh;
    
    public int getCubeArea()
    {
       return (hight*length*breadh);
    }
    
    Cube()
    {
        hight = 10;
        length = 20;
        breadh = 30;
    }
    
    Cube(int h, int l, int b)
    {
        hight = h;
        length = l;
        breadh = b;
    }
}
