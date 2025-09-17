package constructor;

public class product {
    private String productName;
    private int price;
    static int total_products;
    public void displayProductDetails(){
        System.out.println("The name of the product is:"+productName);
        System.out.println("The name of the price is:"+price);
    }
    public static void displayTotalProducts(){
        System.out.println(total_products);
    }
    public static void main(String[] args) {
        product p1 = new product();
        p1.productName = "Laptop";
        p1.price = 80000;
        total_products++;
        p1.displayProductDetails();
        displayTotalProducts();
    }
}
