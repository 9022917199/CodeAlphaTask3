package CodeAlpha;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker 
{

	public static void main(String[] args)
    {
         Scanner scanner = new Scanner(System.in);
        
        // Create an ArrayList to store student grades
        ArrayList<Double> grades = new ArrayList<>();
        
        // Ask the teacher for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        
        // Get grades for each student
        for (int i = 0; i < numStudents; i++)
        {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            double grade = scanner.nextDouble();
            grades.add(grade);
        }
        
        // Calculate and display the average, highest, and lowest grades
        double average = calculateAverage(grades);
        double highest = findHighestGrade(grades);
        double lowest = findLowestGrade(grades);
        
        System.out.println("\nStudent Grade Summary:");
        System.out.println("Average Grade: " + average);
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);
        
        // Close the scanner
        scanner.close();
    }
    
    // Method to calculate the average grade
    public static double calculateAverage(ArrayList<Double> grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
    
    // Method to find the highest grade
    public static double findHighestGrade(ArrayList<Double> grades) {
        double highest = grades.get(0);
        for (double grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }
    
    // Method to find the lowest grade
    public static double findLowestGrade(ArrayList<Double> grades) {
        double lowest = grades.get(0);
        for (double grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }	

}


