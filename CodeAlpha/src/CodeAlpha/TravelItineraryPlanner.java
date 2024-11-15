package CodeAlpha;

import java.util.Scanner;

public class TravelItineraryPlanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TravelItinerary itinerary = new TravelItinerary();

        System.out.println("Welcome to the Travel Itinerary Planner!");

        while (true) {
            System.out.println("\n1. Add Destination");
            System.out.println("2. Display Itinerary");
            System.out.println("3. Fetch Weather for All Destinations");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            if (choice == 1) {
                // Add destination
                System.out.print("Enter destination name: ");
                String name = scanner.nextLine();

                System.out.print("Enter travel date (YYYY-MM-DD): ");
                String date = scanner.nextLine();

                System.out.print("Enter accommodation type (Hotel, Hostel, etc.): ");
                String accommodation = scanner.nextLine();

                System.out.print("Enter estimated budget (in USD): ");
                double budget = scanner.nextDouble();
                scanner.nextLine();  // Consume newline

                itinerary.addDestination(name, date, accommodation, budget);

            } else if (choice == 2) {
                // Display itinerary
                itinerary.displayItinerary();

            } else if (choice == 3) {
                // Fetch weather
                itinerary.fetchWeatherForDestinations();

            } else if (choice == 4) {
                // Exit program
                System.out.println("Exiting the Travel Itinerary Planner. Have a great trip!");
                break;
            } else {
                System.out.println("Invalid choice! Please try again.");
            }
        }

        scanner.close();
    }
}
