package CodeAlpha;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Hotel {
    private List<Room> rooms;

    // Constructor
    public Hotel() {
        rooms = new ArrayList<>();
        // Add some rooms to the hotel (you can expand this)
        rooms.add(new Room("Single", 100, true));
        rooms.add(new Room("Double", 150, true));
        rooms.add(new Room("Suite", 300, true));
        rooms.add(new Room("Suite", 300, false)); // Not available
    }

    // Search for available rooms
    public List<Room> searchRooms(String roomType) {
        List<Room> availableRooms = new ArrayList<>();
        for (Room room : rooms) {
            if (room.isAvailable() && room.getType().equalsIgnoreCase(roomType)) {
                availableRooms.add(room);
            }
        }
        return availableRooms;
    }

    // Method to reserve a room
    public Reservation makeReservation(Room room, Date checkInDate, Date checkOutDate) {
        room.setAvailable(false); // Mark the room as booked
        return new Reservation(room, checkInDate, checkOutDate);
    }

    // Method to display all available rooms
    public void displayAvailableRooms() {
        for (Room room : rooms) {
            if (room.isAvailable()) {
                room.displayRoomInfo();
                System.out.println("----------------------------");
            }
        }
    }
}
