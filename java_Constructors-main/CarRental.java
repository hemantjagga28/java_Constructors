package constructor;
public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
CarRental( String customerName,String carModel,  int rentalDays)
{
    this.customerName=customerName;
    this.carModel=carModel;
    this.rentalDays=rentalDays;
}
public int total_cost(){
    int cost;
    cost=1000*rentalDays;
    return cost;
}
public static void main(String[] args) {
    CarRental obj=new CarRental("ajay",  "virtus", 10);
    int output=obj.total_cost();
    System.out.println("The cost for "+obj.carModel+" for"+obj.rentalDays+" days is"+output);
}

}
