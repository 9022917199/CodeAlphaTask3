package CodeAlpha;

import java.util.Date;

public class Reservation {
    private Room room;
    private Date checkInDate;
    private Date checkOutDate;
    private double totalPrice;

    public Reservation(Room room, Date checkInDate, Date checkOutDate) {
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.totalPrice = calculateTotalPrice();
    }

    // Method to calculate total price based on the number of nights
    private double calculateTotalPrice() {
        long diffInMillis = checkOutDate.getTime() - checkInDate.getTime();
        long diffInDays = diffInMillis / (1000 * 60 * 60 * 24);
        return room.getPrice() * diffInDays;
    }

    // Getters for reservation details
    public Room getRoom() {
        return room;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    // Method to display reservation details
    public void displayReservationDetails() {
        System.out.println("\n--- Reservation Details ---");
        System.out.println("Room Type: " + room.getType());
        System.out.println("Check-in Date: " + checkInDate);
        System.out.println("Check-out Date: " + checkOutDate);
        System.out.println("Total Price: $" + totalPrice);
    }
}
