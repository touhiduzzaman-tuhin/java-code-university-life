
package car;


public class Car {

    private String make;
    private String model;
    private int wheel;
    
    public Car()
    {
        //w = new wheel(4);
    }
    
    public Car(String m, String md, int w)
    {
        this.make = m;
        this.model = md;
        this.wheel = w;
    }
    
    public void display()
    {
        System.out.println(make +model +wheel);
    }
    public static void main(String[] args) {
        Car c1;
        
        c1 = new Car("Toyota\n", "RAV4\n", 7);
        c1.display();
    }

    
    public class Car extends Car
    {
        public Car()
        {
            super();
        }
        
        public Car(String b)
        {
            super("Toyota", "RAV4", 7);
        }
    }
    
}
