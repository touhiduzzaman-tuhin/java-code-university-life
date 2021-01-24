
package customer;

public class Customer {

    private String id;
    private String name;
    private String address;
    
    public Customer (){}
    
    public Customer (String i, String n, String a)
    {
        this.id = i;
        this.name = n;
        this.address = a;
    }
    
    public void display ()
    {
        System.out.println(id + name + address);
    }
    public static void main(String[] args) {
        
        Customer c1, c2;
        
        c1 = new Customer ("Id: 162-15-7727\n", "Name: Tuhin\n", "Rangpur\n");
        c2 = new Customer ("Id: 162-15-1234\n", "Name: Shama\n", "Mirpur\n");
        
        c1.display();
        c2.display();
    }
    
}
