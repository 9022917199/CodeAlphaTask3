package CodeAlpha;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONObject;

public class WeatherService {
    private static final String API_KEY = "YOUR_API_KEY";  // Replace with your OpenWeather API key
    private static final String BASE_URL = "https://api.openweathermap.org/data/2.5/weather?q=";

    public static String getWeather(String destination) {
        try {
            String urlString = BASE_URL + destination + "&appid=" + API_KEY + "&units=metric";
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();

            Scanner scanner = new Scanner(url.openStream());
            StringBuilder response = new StringBuilder();
            while (scanner.hasNext()) {
                response.append(scanner.nextLine());
            }
            scanner.close();

            JSONObject jsonResponse = new JSONObject(response.toString());
            if (jsonResponse.getInt("cod") == 200) {
                String weatherDescription = ((CodeAlpha.JSONObject) jsonResponse.getJSONArray("weather")).getJSONObject(0).getString("description");
                double temperature = ((Object) jsonResponse.getJSONObject("main")).getDouble("temp");

                return "Weather in " + destination + ":\n" +
                       "Temperature: " + temperature + "°C\n" +
                       "Condition: " + weatherDescription;
            } else {
                return "Weather data not available for " + destination;
            }
        } catch (Exception e) {
            return "Error fetching weather data: " + e.getMessage();
        }
    }
}
