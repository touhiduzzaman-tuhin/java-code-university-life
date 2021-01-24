
package customer_std;

    public class Item
    {
        private String id;
        private String name;
        private Double price;
        
        public Item(){}
        
        public Item(String i, String n, String p)
        {
            this.id = i;
            this.name = n;
            this.price = p;
        }
        
        public void display()
        {
            System.out.println("Id: "+id+, "Name: "+name+, "Price: "+price+);
        }
    }
public class Customer_std {

    
    private String id;
    private String name;
    private Double price;
    
    private Arraylist <Item> p = new Arraylist();
    
    public Customer_std (){}
    
    
    public Customer_std(String i, String n)
    {
        this.id = i;
        this.name = n;
    }
    public void display(Item it)
    {
        i.add(it);
    }
    
    public void display()
    {
        System.out.println("Customer Info: ", "Name: "+name+, "Id: "+id+);
        
        System.out.println("Item Bougth\n");
        for(Item item ; i)
            item.display();
    }
    
}

public class Test
{
    public static void main(String args[]) {
       
        Item i1 = new Item ("162", "Shampoo", "500.00");
        Item i2 = new Item ("152", "Oil", "200.00");
        
        Customer_std c1 = new customer_std("1000", "ABC1")
                c1.buyItem(i1);
                c2.buyItem(i2);     
                c1.display();
    }
}
