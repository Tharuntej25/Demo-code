
import java.util.ArrayList;

public class DynamicArrayExample {
    public static void main(String[] args) {
        // Create a dynamic array
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the array
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Print the elements
        System.out.println("Numbers: " + numbers);

        // Get an element at a specific index
        System.out.println("Element at index 1: " + numbers.get(1));

        // Remove an element
        numbers.remove(1);
        System.out.println("After removing element at index 1: " + numbers);

        // Update an element
        numbers.set(1, 50);
        System.out.println("After updating element at index 1: " + numbers);
    }
}
