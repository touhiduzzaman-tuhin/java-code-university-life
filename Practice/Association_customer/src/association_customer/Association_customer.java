
package association_customer;

 public class Item
    {
        private String id;
        private String name;
        private double price;
        
        public Item(){}
        
        public Item(String i, String n, String p)
        {
            this.id = i;
            this.name = n;
            this.price = p;
        }
        
        public void display()
        {
            System.out.println("Id: "+id, "Name: "+name, "Price: "+price);
        }
    }

public class Association_customer {

    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
