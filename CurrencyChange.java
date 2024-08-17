import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner; // Import Scanner class
import java.util.Currency;

public class CurrencyChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the double-precision number from input
        double payment = scanner.nextDouble();
        
        // Create NumberFormat instances for different locales
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        // Format the payment for each locale
        String usFormatted = usFormat.format(payment);
        String indiaFormatted = indiaFormat.format(payment);
        String chinaFormatted = chinaFormat.format(payment);
        String franceFormatted = franceFormat.format(payment);
        
        // Print the results
        System.out.println("US: " + usFormatted);
        System.out.println("India: " + indiaFormatted);
        System.out.println("China: " + chinaFormatted);
        System.out.println("France: " + franceFormatted);
        
        // Close the scanner
        scanner.close();
    }
}
