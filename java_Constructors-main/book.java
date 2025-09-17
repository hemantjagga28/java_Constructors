package constructor;

public class book {
    String book_name;
    String author_name;
    int price;
    book(){
      book_name= "harry potter";
      author_name="jk rowling";
      price= 1000;
    }
    book(String book_name, String author_name, int price){
        this.book_name= book_name;
        this.author_name=author_name;
        this.price=price;
    }
    public void display(){
        System.out.println("the name of the book is:"+book_name+ " by the author: "+ author_name+ " price:"+price);
    }
    public static void main(String[] args) {
        book obj= new book();
        book obj2= new book("wings of fire", "apj abdul kalam",700);
        obj.display();
        obj2.display();
    }
}
