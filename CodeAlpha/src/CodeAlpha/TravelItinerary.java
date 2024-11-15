package CodeAlpha;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TravelItinerary {
    private List<Destination> destinations = new ArrayList<>();
    private double totalBudget = 0;

    public void addDestination(String name, String date, String accommodation, double budget) {
        Destination destination = new Destination(name, date, accommodation, budget);
        destinations.add(destination);
        totalBudget += budget;
    }

    public void displayItinerary() {
        System.out.println("\n--- Your Travel Itinerary ---");
        for (Destination destination : destinations) {
            System.out.println(destination);
            System.out.println("------------------------------");
        }
        System.out.println("Total Estimated Budget: $" + totalBudget);
    }

    public void fetchWeatherForDestinations() {
        for (Destination destination : destinations) {
            String weather = WeatherService.getWeather(destination.getName());
            System.out.println("\nWeather for " + destination.getName() + ":");
            System.out.println(weather);
        }
    }
}
