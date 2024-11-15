package CodeAlpha;

public class Room {
    private String type;       // Room type (e.g., Single, Double, Suite)
    private double price;      // Price per night
    private boolean available; // Availability status

    // Constructor
    public Room(String type, double price, boolean available) {
        this.type = type;
        this.price = price;
        this.available = available;
    }

    // Getters and setters
    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Method to display room details
    public void displayRoomInfo() {
        System.out.println("Room Type: " + type);
        System.out.println("Price per Night: $" + price);
        System.out.println("Availability: " + (available ? "Available" : "Not Available"));
    }
}
