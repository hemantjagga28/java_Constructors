package constructor;

public class vehicle {
    private String ownerName;
    private String vehicleType;
    static double registrationFee;

    public vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        vehicle v1 = new vehicle("Ajay", "Car");
        vehicle v2 = new vehicle("Abhay", "Motorcycle");

        updateRegistrationFee(500.0);

        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();
    }
}
