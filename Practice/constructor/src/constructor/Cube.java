/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author Tuhin
 */
public class Cube {
    int height;
    int bredth;
    int length;
    
    public int getCubeVolume()
    {
        return (height * bredth * length);
    }
    
    Cube()
    {
        height = 10;
        bredth = 20;
        length = 30;
    }
    
    Cube(int h, int b, int l)
    {
        this.length = l;
        this.bredth = b;
        this.height = h;
    }
}
