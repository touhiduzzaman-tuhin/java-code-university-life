
package vehicle;


public class Vehicle {

    private int seat;
    private String make;
    private String model;
    
    public Vehicle(){}
    
    public Vehicle(int st, String m, String md)
    {
        this.seat = st;
        this.make = m;
        this.model = md;
    }
    
    public void display()
    {
        System.out.println(seat +make +model);
    }
    public static void main(String[] args) {
        Vehicle v1;
        
        v1 = new Vehicle(7, "\nToyota\n", "RAV4\n");
        v1.display();
    }
    
    public class Car extends Vehicle
    {
        public Car()
        {
            super();
        }
        
        public Car(String b)
        {
            super(7, "Toyota", "RAV4");
        }
    }
    
}
