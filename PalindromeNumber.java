import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int original = number;
        int reverse = 0;

        // Reverse the digits of the number
        while (number != 0) {
            int digit = number % 10;  // Get the last digit
            reverse = reverse * 10 + digit;  // Add it to the reversed number
            number /= 10;  // Remove the last digit
        }

        // Compare the original number with the reversed number
        if (original == reverse) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
        
        scanner.close();
    }
}


