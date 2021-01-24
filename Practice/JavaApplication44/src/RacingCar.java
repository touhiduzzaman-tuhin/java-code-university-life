/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tuhin
 */
public abstract class RacingCar extends Veheicle implements Game, Derection{
    private String make;
    private String model;
    
    public RacingCar(String c,String mk, String md)
    {
        super(c);
        this.make = mk;
        this.model = md;
    }
    
    public void display()
    {
        System.out.println("Make: " + make + "\n" + "Model: " +model);
    }
    
    @Override
    public void left()
    {
        System.out.println("Left");
    }
    //@Override
    public void rigth()
    {
        System.out.println("Rigth");
    }
    @Override
    public void reverse()
    {
        System.out.println("Reverse");
    }
    //@Override
    public void Start()
    {
        System.out.println("Start");
    }
    @Override
    public void stop()
    {
        System.out.println("Stop");
    }   
}
