public class switchCase {
    public static void main(String[] args) {
        int number = 5;

        switch (number % 2) {
            case 0:
                System.out.println(number + " is an even number.");
                break;
            case 1:
                System.out.println(number + " is an odd number.");
                break;
            default:
                System.out.println("Invalid input.");
        }
    }
}
