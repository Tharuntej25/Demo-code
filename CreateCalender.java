import java.util.*;

public class CreateCalender {

    public static String findDay(int month, int day, int year) {
        // Create a Calendar instance
        Calendar calendar = Calendar.getInstance();
        
        // Set the date using the provided month, day, and year
        calendar.set(year, month - 1, day); // month is 0-based in Calendar
        
        // Get the day of the week (1 = Sunday, 2 = Monday, ..., 7 = Saturday)
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        
        // Array to map day of the week integer to string
        String[] daysOfWeek = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        
        // Return the corresponding day of the week
        return daysOfWeek[dayOfWeek - 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the input
        String[] dateInput = scanner.nextLine().split(" ");
        int month = Integer.parseInt(dateInput[0]);
        int day = Integer.parseInt(dateInput[1]);
        int year = Integer.parseInt(dateInput[2]);
        
        // Find and print the day of the week
        System.out.println(findDay(month, day, year));
        
        // Close the scanner
        scanner.close();
    }
}
