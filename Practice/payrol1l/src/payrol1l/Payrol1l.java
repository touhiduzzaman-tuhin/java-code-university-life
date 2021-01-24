
package payrol1l;


public class Payrol1l {

    private String name;
    private int idnumber;
    private double payrate;
    private double hoursworked;
    
    public Payroll1(String n,int i)
    {
        this.name = n;
        this.idnumber = i;
    }
    
    public void Setname(String n)
    {
        this.name = n;
    }
    
    public void SetIdnumber(int i)
    {
        this.idnumber = i;
    }
    
    public void SetPayrate(double p)
    {
        this.payrate = p;
    }
    
    public void SetHoursworked(double h)
    {
        this.hoursworked = h;
    }
    
    public String getname()
    {
        return getname();
    }
    
    public int getidnumber()
    {
        return getidnumber();
    }
    
    public double getpayrate()
    {
        return getpayrate();
    }
    
    public double gethoursworked()
    {
        return gethoursworked();
    }
    
    public double getGrosspay()
    {
        return hoursworked * payrate;
    }
   
    
}
