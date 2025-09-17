package constructor;
public class Library {
    private String title;
    private String author;
    private double price;
    private boolean available;

    public Library(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is not available for borrowing.");
        }
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available: " + available);
    }

    public static void main(String[] args) {
        Library book = new Library("Java Programming", "Ajay Kumar", 499.99, true);
        book.displayDetails();
        book.borrowBook();
        book.displayDetails();
    }
}
