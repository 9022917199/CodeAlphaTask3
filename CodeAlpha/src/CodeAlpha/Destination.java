package CodeAlpha;

public class Destination 
{
	private String name;
    private String date;
    private String accommodation;
    private double budget;

    public Destination(String name, String date, String accommodation, double budget) {
        this.name = name;
        this.date = date;
        this.accommodation = accommodation;
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getAccommodation() {
        return accommodation;
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public String toString() {
        return "Destination: " + name +
               "\nDate: " + date +
               "\nAccommodation: " + accommodation +
               "\nBudget: $" + budget;
    }

}
