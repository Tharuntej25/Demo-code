import java.util.Scanner;

public class MultipleOfThreeAndFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println(number + " is a multiple of both 3 and 5.");
        } else {
            System.out.println(number + " is not a multiple of both 3 and 5.");
        }
        
        scanner.close();
    }
}
