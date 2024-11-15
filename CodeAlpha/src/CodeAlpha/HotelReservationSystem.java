package CodeAlpha;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class HotelReservationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel();
        System.out.println("Welcome to the Hotel Reservation System!");
        
        while (true) {
            System.out.println("\n1. Search for Available Rooms");
            System.out.println("2. Make a Reservation");
            System.out.println("3. View Booking Details");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            if (choice == 1) {
                // Search for available rooms
                System.out.print("Enter room type (Single, Double, Suite): ");
                String roomType = scanner.nextLine();
                List<Room> availableRooms = hotel.searchRooms(roomType);
                
                if (availableRooms.isEmpty()) {
                    System.out.println("No available rooms found for this type.");
                } else {
                    System.out.println("Available Rooms:");
                    for (Room room : availableRooms) {
                        room.displayRoomInfo();
                    }
                }
            } else if (choice == 2) {
                // Make a reservation
                System.out.print("Enter room type (Single, Double, Suite): ");
                String roomType = scanner.nextLine();
                List<Room> availableRooms = hotel.searchRooms(roomType);

                if (availableRooms.isEmpty()) {
                    System.out.println("No available rooms for this type.");
                } else {
                    System.out.print("Enter check-in date (YYYY-MM-DD): ");
                    String checkInDateStr = scanner.nextLine();
                    System.out.print("Enter check-out date (YYYY-MM-DD): ");
                    String checkOutDateStr = scanner.nextLine();
                    
                    // In a real application, parse the dates using DateFormat or LocalDate
                    Date checkInDate = new Date();
                    Date checkOutDate = new Date();
                    
                    // Assume user selects the first available room for simplicity
                    Room room = availableRooms.get(0);
                    Reservation reservation = hotel.makeReservation(room, checkInDate, checkOutDate);
                    reservation.displayReservationDetails();
                    
                    // Process payment
                    System.out.print("Enter payment amount: $");
                    double paymentAmount = scanner.nextDouble();
                    if (Payment.processPayment(reservation.getTotalPrice(), paymentAmount)) {
                        System.out.println("Reservation confirmed!");
                    } else {
                        System.out.println("Reservation failed due to payment issue.");
                    }
                }
            } else if (choice == 3) {
                // View booking details (this could be a more complex implementation in a real system)
                System.out.println("Feature not yet implemented.");
            } else if (choice == 4) {
                System.out.println("Exiting Hotel Reservation System. Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
