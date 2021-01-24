
package address;

public class Address {

   private int houseNo;
   private int roadNo;
   private String road;
   private String city;
   
   public void Address(){}
   
   public Address(int hN, int rN, String r, String c){
       this.houseNo = hN;
       this.roadNo = rN;
       this.road = r;
       this.city = c;
   }
   public void display(){
       System.out.println(houseNo +roadNo +road +city);
   }

    public static void main(String[] args) {
        Address a1,a2;
        
        a1 = new Address("House No: "12, "Road No: "56, "Road: Sukrabad\n", "City: Dhaka\n");
        a2 = new Address("House No: "32, "Road No: "45, "Road: Razabazar\n", "City: Dhaka\n");

        a1.display();
        a2.display();
    }
    
}
