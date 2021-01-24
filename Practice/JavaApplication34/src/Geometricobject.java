
 
public class Geometricobject {
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;
    
    public Geometricobject()
    {
       
    }
    public Geometricobject(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }
    
    public String getcolor()
    {
        return color;
    }
    public void setcolor(String color)
    {
        this.color = color;
    }
    
    public boolean isfilled()
    {
        return filled;
    }
    public void setfilled(boolean filled)
    {
        this.filled = filled;
    }
    
        
}
