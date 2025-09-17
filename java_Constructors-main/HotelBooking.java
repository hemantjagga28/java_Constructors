package constructor;

public class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    public HotelBooking() {
        this("Guest", "Standard", 1);
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBooking(HotelBooking other) {
        this(other.guestName, other.roomType, other.nights);
    }

    public void displayBooking() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
        System.out.println("Total Cost: $" + calculateCost());
    }

    private double calculateCost() {
        double rate;
        switch (roomType.toLowerCase()) {
            case "deluxe":
                rate = 150.0;
                break;
            case "suite":
                rate = 250.0;
                break;
            default:
                rate = 100.0;
        }
        return rate * nights;
    }

    public static void main(String[] args) {
        HotelBooking booking1 = new HotelBooking();
        HotelBooking booking2 = new HotelBooking("Alice", "Deluxe", 3);
        HotelBooking booking3 = new HotelBooking(booking2);

        System.out.println("Booking 1:");
        booking1.displayBooking();
        System.out.println("\nBooking 2:");
        booking2.displayBooking();
        System.out.println("\nBooking 3 (Copy of Booking 2):");
        booking3.displayBooking();
    }
}
