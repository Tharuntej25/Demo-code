import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first side: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second side: ");
        int b = scanner.nextInt();
        System.out.print("Enter the third side: ");
        int c = scanner.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("The sides form a valid triangle.");
        } else {
            System.out.println("The sides do not form a valid triangle.");
        }
        
        scanner.close();
    }
}
